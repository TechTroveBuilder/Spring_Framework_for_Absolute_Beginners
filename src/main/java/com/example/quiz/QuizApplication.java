package com.example.quiz;

//import java.util.ArrayList;

//import java.util.Collections;

//import java.util.List;
//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.quiz.service.QuizService;
//import com.example.quiz.entity.Quiz;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
//		.getBean(QuizApplication.class).execute();
	}
	
//	@Autowired
//	QuizRepository repository;
//	QuizService service;
//	private void execute() {
//		setup();
//		showList();
//		showOne();		
//		updateQuiz();
//		deleteQuiz();	
//		doQuiz();
//		
//	}
//	
//	private void setup() {
//		System.out.println("--------Insert----start-----");
//		Quiz quiz1 = new Quiz(null,"question.1",false,"Tom");
//		Quiz quiz2 = new Quiz(null,"question.2",true,"Ema");
//		Quiz quiz3 = new Quiz(null,"question.3",false,"Tom");
//		Quiz quiz4 = new Quiz(null,"question.4",true,"Ema");
//		Quiz quiz5 = new Quiz(null,"question.5",false,"Tom");
//		
//		List<Quiz>  quizList= new ArrayList<>();
//		Collections.addAll(quizList, quiz1,quiz2,quiz3,quiz4,quiz5);
//		for(Quiz quiz : quizList) {
//			service.insertQuiz(quiz);
//		}
//		System.out.println("--------Insert----end--------");
//	}
//	
//	private void showList() {
//		System.out.println("--------findAll---start---------");
//		Iterable<Quiz> quizzes = service.selectAll();
//		for(Quiz quiz : quizzes) {
//			System.out.println(quiz);
//		}
//		System.out.println("--------findAll---end---------");
//	}
//	
//	private void showOne() {
//		System.out.println("----oneFINDstart----");
//		Optional<Quiz> quizOpt = service.selectOneById(1);
//		if(quizOpt.isPresent()) {
//			System.out.println(quizOpt.get());
//		}else {
//			System.out.println("noDATA..");
//		}
//		System.out.println("----oneFINDend----");
//	}
//	
//	private void updateQuiz() {
//		System.out.println("----UPDATEtart----");
//		Quiz quiz3 = new Quiz(3,"-->update",true,"re:Tom");
//		service.updateQuiz(quiz3);
//		System.out.println("done__UPDATE");
//	}
//	
//	private void deleteQuiz() {
//		System.out.println("----DELETEstart----");
//		service.deleteQuizById(2);
//		System.out.println("----DELETEend----");
//	}
//	
//	private void doQuiz() {
//		System.out.println("--quiz_one_do---");
//		Optional<Quiz> quizOpt = service.selectOneRandomQuiz();
//		
//		if(quizOpt.isPresent()) {
//			System.out.println(quizOpt.get());
//		}else {
//			System.out.println("no_data");
//		}
//		System.out.println("--quiz_one_do--end........");
//		System.out.println("...................");
//		
//		boolean myAnswer = false;
//		Integer id = quizOpt.get().getId();
//		if(service.checkQuiz(id, myAnswer)) {
//			System.out.println("〇");
//		}else {
//			System.out.println("×");
//		}
//		
//	}
	

	

	


}
