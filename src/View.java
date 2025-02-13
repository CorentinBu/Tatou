import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JPanel menuPanel;
    private JPanel leftMenuPanel;
    private JScrollPane scrollPane;

    public View() {

        frame = new JFrame("Tatou");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080); // Taille de la fenêtre
        frame.setLayout(new BorderLayout());

        // Couleur de fond de la fenêtre principale
        frame.getContentPane().setBackground(new Color(0xFFA83C));

        menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(frame.getWidth(), 100));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        menuPanel.setBackground(new Color(0xC8280E));

        JButton associationsButton = createStyledButton("Associations");
        JButton jobsButton = createStyledButton("Jobs");
        JButton sportsButton = createStyledButton("Sports");
        JButton rechercheButton = createStyledButton("Recherche");

        menuPanel.add(associationsButton);
        menuPanel.add(jobsButton);
        menuPanel.add(sportsButton);
        menuPanel.add(rechercheButton);

        frame.add(menuPanel, BorderLayout.NORTH);

        leftMenuPanel = new JPanel();
        leftMenuPanel.setPreferredSize(new Dimension(100, frame.getHeight()));
        leftMenuPanel.setLayout(new BoxLayout(leftMenuPanel, BoxLayout.Y_AXIS));
        leftMenuPanel.setBackground(new Color(0xC8280E));

        JButton profilButton = createStyledButton("Profil");
        JButton associationsSuiviesButton = createStyledButton("Associations suivies");
        JButton deconnexionButton = createStyledButton("Déconnexion");

        leftMenuPanel.add(profilButton);
        leftMenuPanel.add(associationsSuiviesButton);
        leftMenuPanel.add(deconnexionButton);

        frame.add(leftMenuPanel, BorderLayout.WEST);

        JPanel publiPanel = new JPanel();
        publiPanel.setLayout(new BoxLayout(publiPanel, BoxLayout.Y_AXIS));
        publiPanel.setBackground(new Color(0xFFA83C));

        publiPanel.add(new Publi("Nom Asso 1", "Titre Publication 1", "Description courte de la publication 1"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 2", "Titre Publication 2", "Description courte de la publication 2"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 3", "Titre Publication 3", "Description courte de la publication 3"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        publiPanel.add(new Publi("Nom Asso 1", "Titre Publication 1", "Description courte de la publication 1"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 2", "Titre Publication 2", "Description courte de la publication 2"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 3", "Titre Publication 3", "Description courte de la publication 3"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        publiPanel.add(new Publi("Nom Asso 1", "Titre Publication 1", "Description courte de la publication 1"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 2", "Titre Publication 2", "Description courte de la publication 2"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 3", "Titre Publication 3", "Description courte de la publication 3"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        publiPanel.add(new Publi("Nom Asso 1", "Titre Publication 1", "Description courte de la publication 1"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 2", "Titre Publication 2", "Description courte de la publication 2"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        publiPanel.add(new Publi("Nom Asso 3", "Titre Publication 3", "Description courte de la publication 3"));
        publiPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(new Color(0xFFA83C));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        centerPanel.add(publiPanel, gbc);

        scrollPane = new JScrollPane(centerPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        Font currentFont = button.getFont();
        Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), (int) (currentFont.getSize() * 1.5));
        button.setFont(newFont);
        button.setBackground(new Color(0xC8280E));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }
}