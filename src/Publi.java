import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Publi extends JPanel {
    private String nom;
    private String titre;
    private String description;

    public Publi(String nom, String titre, String description) {
        this.nom = nom;
        this.titre = titre;
        this.description = description;

        // Configuration du panel
        setPreferredSize(new Dimension(800, 80));
        setBackground(new Color(0x620D2A));
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JLabel nomLabel = new JLabel(nom + " - ");
        JLabel titreLabel = new JLabel(titre + " - ");
        JLabel descriptionLabel = new JLabel(description);

        nomLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titreLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        nomLabel.setForeground(Color.WHITE);
        titreLabel.setForeground(Color.WHITE);
        descriptionLabel.setForeground(Color.WHITE);

        add(nomLabel);
        add(titreLabel);
        add(descriptionLabel);

        setBorder(new RoundedBorder(10));
    }

    private class RoundedBorder implements Border {
        private int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 1, this.radius + 1);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    }
}