import javax.swing.*;
import java.awt.*;

public class SignupForm {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Sign up form");
		mainFrame.setSize(300,150);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(6,2,10,10));
		JLabel nameLabel =new JLabel("Name");
		JTextField namField =new JTextField();
		JLabel emailLabel =new JLabel("Email ID");
		JTextField emailField =new JTextField();
		
		JLabel genderLabel = new JLabel("gender");
		JRadioButton male =new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		ButtonGroup genderButtonGroup = new ButtonGroup();
		genderButtonGroup.add(male);
		genderButtonGroup.add(female);
		
		JPanel genderPanel = new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		JLabel CountryLabel = new JLabel();
		String [] countries = {"India","China","USA","Japan"};
		JComboBox<String> countrybox =new JComboBox<>(countries);
		JLabel addressLabel = new JLabel("Address");
		JTextArea addressArea = new JTextArea(3,4);
		JButton submitButton = new JButton("Submit");
		mainPanel.add(nameLabel);mainPanel.add(namField);
		mainPanel.add(emailLabel);mainPanel.add(emailField);
		mainPanel.add(genderPanel);mainPanel.add(genderLabel);
		mainPanel.add(CountryLabel);mainPanel.add(countrybox);
		mainPanel.add(addressLabel);mainPanel.add(addressArea);
		mainPanel.add(new JLabel(" "));mainPanel.add(submitButton);
		
		mainFrame.add(mainPanel);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

}
