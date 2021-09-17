package com.example.doan_laptrinhdidong;

import android.content.Context;

import com.example.doan_laptrinhdidong.Model.BaiThiThu;
import com.example.doan_laptrinhdidong.Model.ChangeSentences;
import com.example.doan_laptrinhdidong.Model.DanhMucTu;
import com.example.doan_laptrinhdidong.Model.DocHieu;
import com.example.doan_laptrinhdidong.Model.FamilyWord;
import com.example.doan_laptrinhdidong.Model.Grammar;
import com.example.doan_laptrinhdidong.Model.Listening;
import com.example.doan_laptrinhdidong.Model.Nghe;
import com.example.doan_laptrinhdidong.Model.Part1;
import com.example.doan_laptrinhdidong.Model.Part7;
import com.example.doan_laptrinhdidong.Model.TuVung;
import com.example.doan_laptrinhdidong.Model.Vocabulary;

import java.util.ArrayList;

public class Utils {
    Context context;
    public Utils(Context context) {
        this.context = context;
    }

    public ArrayList<Vocabulary> getDataVocabulary()
    {
        ArrayList<Vocabulary> ds = new ArrayList<>();
        ds.add(new Vocabulary("The charity aims to _____ food and shelter for underprivileged in the remote areas of the country", "present","assist","provide", "offer","C"));
        ds.add(new Vocabulary("We need to promote a lifestyle that is__ to the environment.", "friendly","friend","friendship", "friendliness","A"));
        ds.add(new Vocabulary("At school, children learn a lot of ____ such as maths, biology, history, geography and English.", "subjects","topics","lessons", "objects","A"));
        ds.add(new Vocabulary("The child that we caught _____ was made to stand in the corner of the classroom.", "misbehavior","misbehave","behaving", "misbehaving","D"));
        ds.add(new Vocabulary("Make sure you___ up the data on your computer, because you might get a virus.", "back","store","save", "copy","A"));
        ds.add(new Vocabulary("Population explosion seems to surpass the ability of the earth to___ the demand for food.", "make","need","have", "meet","D"));
        ds.add(new Vocabulary("My parents will have celebrated 30 years of ___ by next week.", "marry","married","marriageable", "marriage","D"));
        ds.add(new Vocabulary("The singer was___ on the piano by her sister.", "discarded","accompanied","performed", "played","B"));
        ds.add(new Vocabulary("He did not share his secrets with other people, but he___in her.", "confessed","concealed","confided", "consented","C"));
        ds.add(new Vocabulary("Great___ should be given to the conservation of endangered species.", "diversity","priority","opportunity", "condition","B"));
        ds.add(new Vocabulary("Departmental restructuring will be discussed at the _____ monthly meeting.","next","always","soon","like","A"));
        ds.add(new Vocabulary("To keep _____ park beautiful, please place your non recyclables in the available trash cans.","our","we","us","ours","A"));
        ds.add(new Vocabulary("Mr. Hardin _____ additional images of the office building he is interested in leasing.","informed","asked","advised","requested","D"));
        ds.add(new Vocabulary("A team of agricultural experts will be brought _____ to try to improve crop harvests.","because","either","between","together","D"));
        ds.add(new Vocabulary("The board of Galaxipharm _____ Mr.K won's successor at yesterday's meeting.","named","granted","founded","proved","C"));
        ds.add(new Vocabulary("If your parking permit is damaged, bring it to the entrance station for a _____.","replacement","replacing","replace","replaces","C"));
        ds.add(new Vocabulary("Mr. Ahmad decided to reserve a private room for the awards dinner _____ the restaurant was noisy.","rather than","in case","such as","unless","B"));
        ds.add(new Vocabulary("Ms. Jones has provided a _____ estimate of the costs of expanding distribution statewide.","conserve","conserves","conservative","conservatively","C"));
        ds.add(new Vocabulary("Each quarter, Acaba Exports sets _____ sales goals for its staff.","compact","wealthy","faithful","realistic","D"));
        ds.add(new Vocabulary("Children under five years of age are eligible _____ free vision tests.","over","down","for","out","C"));
        ds.add(new Vocabulary("Drivers on the Partan Expressway are reminded to drive _____ throughout July because of the ongoing construction work","caution","cautiously","cautious","cautiousness","B"));
        ds.add(new Vocabulary("The committee will resume its weekly meetings _____ Ms. Cheon returns from Scotland on September 17.","that","once","as well","then","B"));
        ds.add(new Vocabulary("The _____ initiative aims to provide public transportation for commuters living in the outer suburbs","proposed","proposing","proposal","propose","A"));
        ds.add(new Vocabulary("Yesterday's storm _____ interrupted the services of the Duddula, Inc., satellite communications system.","annually","anytime","whenever","temporarily","D"));
        ds.add(new Vocabulary("Even though Cabrera Pictures and Marcella Images make very different films, _____ are successful movie studios.","several","everybody","some","both","D"));
        ds.add(new Vocabulary("_____ of tasks can make a manager's job easier and help other employees learn new skills.","Reputation","Foundation","Delegation","Permission","C"));
        ds.add(new Vocabulary("Proceeds from the sale of Delcrest Corporation were equally _____ among the founder's three daughters.","divisions","dividing","divide","divided","D"));
        ds.add(new Vocabulary("Ricardo Sosa, the executive chef at Restaurant Ninal, responds to guests' suggestions _____.","respect","respects","respectfully","respected","C"));
        ds.add(new Vocabulary("Mr. Koster is negotiating the _____ of the new contract with Arban, Inc.","scope","turn","grip","drive","A"));
        ds.add(new Vocabulary("The equipment-use guidelines _____ on our internal corporate Web site.","may find","can be found","have found","have to find","B"));
        ds.add(new Vocabulary("Free Internet service ____ available in the lobby but not in the guest rooms","being","to be","are","is","D"));
        ds.add(new Vocabulary("A third branch ____ Starshom Hair Salon will open in Georgetown's industrial district","up","of","along","in","B"));
        ds.add(new Vocabulary("The March shipment to Busan can fit an ____ thirteen containers","adding","additional","addition","add","B"));
        ds.add(new Vocabulary("Ms. Tran ____ the clients fifteen different apartments in one afternoon","made","opened","passed","showed","D"));
        ds.add(new Vocabulary("Mr. Sweeney is most pleased when ____ press releases are published unedited","he","him","his","himself","C"));
        ds.add(new Vocabulary("Whenever company costs ____ significantly, the budget is adjusted","rise","rises","risen","rising","A"));
        ds.add(new Vocabulary("This is a ___ to all employee to submit expense reports by the end of the month","remind","reminded","reminding","reminder","D"));
        ds.add(new Vocabulary("Please e-mail Human Resources if you are able to help set up the events room ___ the annual office party","since","before","into","except","B"));
        ds.add(new Vocabulary("Aita Corporation will hire roughly 50 new employees ____ the next year","over","while","somewhere","ideally","A"));
        ds.add(new Vocabulary("Dine Out Magazine will publish an article next month about people who ___ go to the same restaurant","repeated","repeatedly","repeat","repetition","B"));
        ds.add(new Vocabulary("The aircraft's _____ flight had arrived late, so its scheduled 10:15 AM departure was delayed","committed","entitled","previous","spacious","C"));
        ds.add(new Vocabulary("Blue Form Company offers its employees ___ in their working location an hours","flexible","flex","flexibiliity","flexed","C"));
        ds.add(new Vocabulary("The latest sales figures ___ to the vice president that the company was doing well","reinforcing","reinforcement","reinforces","reinforced","D"));
        ds.add(new Vocabulary("Management at the Sidol Factory is researching different ____ to enhancing employee productivity","instincts","decisions","occasions","approaches","D"));
        ds.add(new Vocabulary("Only two percent of the focus group participants reported ____ disliking the new ice-cream flavor","stronger","strong","strongly","strongest","C"));
        ds.add(new Vocabulary("Our line of passenger cars includes the latest ____ technology to protect vehicles and their passengers","safety","more safely","most safely","saves","A"));
        ds.add(new Vocabulary("Jetways Japan and Night Sky Airways have ___ a planned merger, which is under review by government regulators","treated","flown","announced","spead","C"));
        ds.add(new Vocabulary("The old Abita Theater was demolished one week ago, and construction of an office complex at the site is ____ underway","yet","usually","soon","already","D"));
        ds.add(new Vocabulary("Wreen Watch's latest smart watch offers ____ features not found in other products","similar","multiple","broken","careful","B"));
        ds.add(new Vocabulary("Although the conference does not ____ begin until Friday, many participants have informal meetings scheduled for Thursday","official","officiate","officials","officially","D"));
        ds.add(new Vocabulary("Each year the Metro Enterprise Association honors a local business that has made a ____ impact on the city","comfortable","significant","difficult","granted","B"));
        ds.add(new Vocabulary("Martaska Technologies requires ____ new employees receive at latest two weeks of training before starting work","that","for","and","when","A"));
        ds.add(new Vocabulary("Retailers were given one year to ____ their terminals to accommodate new credit card technology","upgrade","progress","motivate","describe","A"));
        ds.add(new Vocabulary("Marketers find that older cusumers respond best to facts and statistics, _____ for teenagers, the best strategy is humor","such as","whereas","due","almost","B"));
        ds.add(new Vocabulary("Because of a processing error, Elmore Distributors ____ shipped cases of frozen fish to a bakery","equally","illegibly","accidentally","vigorously","C"));
        ds.add(new Vocabulary("With ____ fromt he board of directors, CEO Brian Krieder is aggressively pursuing fresh revenue sources","authorization","authorizes","authorize","authorized","A"));
        ds.add(new Vocabulary("Mr. Itomitsu's recent book on fitness encourages readers strive for a healthy ___ between physical exertion and rest","quantity","supply","balance","number","C"));
        ds.add(new Vocabulary(" ____ an anonymous donation, the Metropolitan Hospital was able to purchase new imaging equipment","In case","As though","Owing to","If only","C"));
        ds.add(new Vocabulary("Employees __ cars are parked in designated client spaces should move them immediately","those","other","who","whose","D"));
        ds.add(new Vocabulary("The design team considered many possible _____before settling on the red and black color scheme for the corporate Web site","functions","combinations","destinations","roles","B"));
        return ds;
    }

    public ArrayList<Listening> getDataListening()
    {
        ArrayList<Listening> ds = new ArrayList<>();
        ds.add(new Listening("bainghe1.mp3","How does Joshua go to school in Japan?","He takes a school bus every morning.","He rides the subway at 8:00 AM.","He walks with a group of students.","He goes by himself","C"));
        ds.add(new Listening("bainghe1.mp3","Which item did Joshua NOT mention when talking about the things he takes to school?","backpack","gym clothes","bag","school hat","D"));
        ds.add(new Listening("bainghe1.mp3","What is one of the first things Joshua does when he arrives at school?","He practices his reading and writing.","He stands and bows to the teacher.","He puts on his gym clothes for class.","He doesn't do anything.","B"));
        ds.add(new Listening("bainghe1.mp3","Where does Joshua eat lunch at school?","in his classroom","in the lunchroom","in the gymnasium","in the stadium","A"));
        ds.add(new Listening("bainghe1.mp3","What time does Joshua probably get home from school most days?","between 1:00 PM and 2:00 PM","between 2:00 PM and 3:00 PM","between 3:00 PM and 4:00 PM","between 4:00 PM and 5:00 PM","B"));

        ds.add(new Listening("bainghe2.mp3","What does Susan have to do on Saturday morning?","walk the dog","clean the house","go to the doctor","go to school","B"));
        ds.add(new Listening("bainghe2.mp3","Where does Susan have to go at 12:30?","to school","to the dentist","to the science museum","to do homework","B"));
        ds.add(new Listening("bainghe2.mp3","What time is Susan meeting with Julie?","at 12:00 p.m.","at 1:00 p.m.","at 3:00 p.m.","at 2:00 p.m.","D"));
        ds.add(new Listening("bainghe2.mp3","What will Susan do after she cooks dinner?","clean the dishes","play soccer with her brother","call a friend","do homework","A"));
        ds.add(new Listening("bainghe2.mp3","Why can't they watch a video at Susan's house??","They can't decide on a video.","Susan's mother is going to use it.","The TV isn't working.","The video can't open","C"));

        ds.add(new Listening("voicemail.mp3","Bill is going to ______ tomorrow.","a dance","a party","a game","a cinema","C"));
        ds.add(new Listening("voicemail.mp3","Hank has to work late because he needs to _____.","attend a meeting","write a report","close the office","get the bag","B"));
        ds.add(new Listening("voicemail.mp3","Hank is going to visit Lisa because _____.","she is sick in bed","he is going to take her to Bill's house","he has to return something","he have a freedom","A"));
        ds.add(new Listening("voicemail.mp3","Hank is going to get snacks at _____.","his work","the store","his house","the mart","C"));
        ds.add(new Listening("voicemail.mp3","Hank will probably finish his work by ____.","9:00 p.m.","8:00 p.m.","7:00 p.m.","6:00 p.m","B"));

        ds.add(new Listening("apartmentsforrent.mp3","What is the main topic of the conversation?","a search for a new apartment","the cost of rent near universities","the problems with living in an apartment","The working house","A"));
        ds.add(new Listening("apartmentsforrent.mp3","Why doesn't Ann like her current apartment?","It's far from campus.","The neighborhood is noisy.","It's too expensive.","It's so small","A"));
        ds.add(new Listening("apartmentsforrent.mp3","How much money does Ann want to pay for rent?","around $200","a little more than $200","no more than $200","around $100","C"));
        ds.add(new Listening("apartmentsforrent.mp3","Ann wants to rent an apartment that _____.","is close to campus","already has furniture","is in a good neighborhood","It's bigger than old house","B"));
        ds.add(new Listening("apartmentsforrent.mp3","To help Ann, Roger is going to _____.","look online for rentals","call his friend","check out an apartment","buy another house for her","C"));

        ds.add(new Listening("campinggear.mp3","What are they planning on doing in the morning?","mountain biking","hiking","fishing","doing exercise","B"));
        ds.add(new Listening("campinggear.mp3","According to the weather report, when is it going to start raining?","in the afternoon","in the morning","at night","at noon","C"));
        ds.add(new Listening("campinggear.mp3","What did Paul forget to bring?","rain boots","rain coats","umbrellas","key","B"));
        ds.add(new Listening("campinggear.mp3","Sarah left the playing cards _____ the picnic table.","on","under","next to","behind","C"));
        ds.add(new Listening("campinggear.mp3","What do they finally decide to do?","stay at a hotel","sleep at the campground","return home","go beach","B"));

        ds.add(new Listening("christmasiscoming","What does the little boy NOT ask for Christmas?","a toy train","a play car","a radio receiver","a Christmas card","A"));
        ds.add(new Listening("christmasiscoming","What does the girl want for Christmas?","Barbie playhouse","marbles","dolls","balloon","C"));
        ds.add(new Listening("christmasiscoming","What food do the children want to make for Santa's reindeer?","hot chocolate, oranges, and corn","apples, oranges, and cookies","cookies, apples, and carrots","bananas, potatoes, tomatoes","B"));
        ds.add(new Listening("christmasiscoming","What time are the children going to go to bed?","9:00 p.m.","7:00 p.m.","8:00 p.m.","6:00 p.m","B"));
        ds.add(new Listening("christmasiscoming","How is Santa going to enter the house?","How is Santa going to enter the house?","through a basement window","down the chimney","windows","C"));

        return ds;
    }

    public ArrayList<Grammar> getDataGrammar()
    {
        ArrayList<Grammar> ds = new ArrayList<>();
        ds.add(new Grammar("Am/is/are","He...here","am","is","be","are","B"));
        ds.add(new Grammar("Am/is/are","Hello guy. How.....you?","are","is","am","I","A"));
        ds.add(new Grammar("Simple Present","She...like dog","don't","aren't","isn't","doesn't","D"));
        ds.add(new Grammar("Simple Present","The sun... very big","am","is","so","too","B"));
        ds.add(new Grammar("Simple Present","I... a cat","am","had","have","has","C"));
        ds.add(new Grammar("Present Continuous","The children...football now.","are playing","playing","play","played","A"));
        ds.add(new Grammar("Present Continuous","Look! The child....","cried","is crying","cry","crying","B"));
        ds.add(new Grammar("Present Continuous","He...always...our books and then he doesn’t remember","does...borrowing","is...borrow","is...borrowing","do...borrowing","C"));
        ds.add(new Grammar("Present Continuous","He...tomorrow","is coming","will come","come","coming","A"));
        ds.add(new Grammar("Present Continuous","What...you...next week?","were...doing","are...do","is...doing","are...doing","D"));
        ds.add(new Grammar("Present Perfect","They...for nearly fifty years","have been married","has been married","have be married","has be married","A"));
        ds.add(new Grammar("Present Perfect","I...the guitar ever since I was a teenager.","has played","have played","had played","played","B"));
        ds.add(new Grammar("Present Perfect","...you...George?","Has...ever met","have...met","Have...ever met","have...ever meet","C"));
        ds.add(new Grammar("Present Perfect","I’m tired out. I...all day.","Has been working","Have be worked","Have been worked","Have been working","D"));
        ds.add(new Grammar("Present Perfect","Scientists...a new breed of monkey.","have recently discovered","has recently discovered","discovery","discovered","A"));
        ds.add(new Grammar("Simple Past","He...at McDonald’s.","worked","work","is working","has worked","A"));
        ds.add(new Grammar("Simple Past","He...a new job if he really tried.","got","could get","can get","can got","B"));
        ds.add(new Grammar("Simple Past","I...always...someone who really needed help.","will...help","helped","would...help","would helped","C"));
        ds.add(new Grammar("Simple Past","I wish it...so cold.","aren't","isn't","weren't","wasn't","D"));
        ds.add(new Grammar("Simple Past","I just hoped you...able to help me.","would be","will be","will","would","A"));
        ds.add(new Grammar("Past Perfect","I...all my homework before 9 p.m yesterday.","had done","done","have done","do","A"));
        ds.add(new Grammar("Past Perfect","He phoned me after he...the exam.","pass","had passed","passed","have passed","B"));
        ds.add(new Grammar("Past Perfect","He...home when his mother got there","hadn't came","came","hadn't come","come","C"));
        ds.add(new Grammar("Past Perfect","By 5pm yesterday she...his house.","left","have left","has left","had left","D"));
        ds.add(new Grammar("Past Perfect","...the film...when he arrived at the cinema?","Had...end","Have...ended","Had...ended","Has...ended","C"));
        ds.add(new Grammar("Simple Future","I think the United...the game.","will win","will wins","will to win","win","A"));
        ds.add(new Grammar("Simple Future","I think the United...the game.","to win","is going to win","win","is being to win","B"));
        ds.add(new Grammar("Simple Future","We...a meal.","have","has","are going to have ","will have","C"));
        ds.add(new Grammar("Simple Future","Oh, I’ve left the door open. I...and shut it.","am going to go","goes","go","will go","D"));
        ds.add(new Grammar("Simple Future","...you...to Tam Dao on the weekend?","Are...going to go","Do...go","Did...go","Will...go","D"));
        ds.add(new Grammar("Past Continuous","They...secretly after school.","were meeting","werr meet","met","are meeting","A"));
        ds.add(new Grammar("Past Continuous","The children...their homework when I got home.","was doing","were doing","doing","are going to do","B"));
        ds.add(new Grammar("Past Continuous","I...dinner while my son...with our dog.","cooking...playing","cooked...played","was cooking...was playing","was cooking...played","C"));
        ds.add(new Grammar("Past Continuous","...I...TV at 8 P.M last night?","Was...watched","Did...watch","Does...watch","Was...watching","D"));
        ds.add(new Grammar("Past Continuous","I...when she called.","worked","was working","work","had worked","B"));
        ds.add(new Grammar("Present Perfect Continuous","I...for you since 4 p.m.","have been waiting","have waited","have being waited","had waited","A"));
        ds.add(new Grammar("Present Perfect Continuous","She...for more than 2 hours.","has been worked","has been working","has worked","working","B"));
        ds.add(new Grammar("Present Perfect Continuous","...she...all day?","Has...being worked","Has...been worked","Has...been working","Had...worked","C"));
        ds.add(new Grammar("Present Perfect Continuous","Micky...English for 10 years.","has learnt","had learnt","has being learnt","has been learning","D"));
        ds.add(new Grammar("Present Perfect Continuous","He is exhausted because he...all day.","has been working","was working","worked","works","A"));
        ds.add(new Grammar("Past Continous","When I last saw him, he _____ in London.","has lived","is living","was living","has been living","C"));
        ds.add(new Grammar("Present Perfect","We _______ Dorothy since last Saturday.","don’t see","haven’t seen","didn’t see","hadn’t seen","B"));
        ds.add(new Grammar("Simple Past","The train ______ half an hour ago","has been leaving","left","has left"," had left","B"));
        ds.add(new Grammar("Present Perfect","Jack ______ the door.","has just painted","paint","will have painted","painting","A"));
        ds.add(new Grammar("Present Perfect Continuous","My sister ________ for you since yesterday","is looking","was looking","has been looking","looked","C"));
        ds.add(new Grammar("Present Continous","I ______ Texas State University now.","am attending","attend","was attending","attended","A"));
        ds.add(new Grammar("Present Perfect","He has been selling motorbikes ________.","ten years ago","since ten years","for ten years ago","for ten years ago","D"));
        ds.add(new Grammar("Simple Past","Christopher Columbus _______ American more than 500 years ago.","discovered","has discovered","had discovered","had been discovering","A"));
        ds.add(new Grammar("Past Continous","He fell down when he ______ towards the church.","run","runs","was running","had run","C"));
        ds.add(new Grammar("Simple Past","We _______ there when our father died.","still lived","lived still","was still lived","was still living","A"));
        ds.add(new Grammar("Future Continous","They ______ table tennis when their father comes back home.","will play","will be playing","play","would play","B"));
        ds.add(new Grammar("Future perfect continuous","By Christmas, I _______ for Mr. Smith for six years.","will have been working","will work","have been working","will be working","A"));
        ds.add(new Grammar("Simple Present","I _______ in the room right now","am being","was being","have been being","am","D"));
        ds.add(new Grammar("Present Perfect","I ______ to New York three times this year.","have been","was","were","had been","A"));
        ds.add(new Grammar("Simple Present","I’ll come and see you before I _______ for the States.","leave","will leave","have lef","shall leave","A"));

        return ds;
    }

    public ArrayList<FamilyWord> getDataFamilyWord()
    {
        ArrayList<FamilyWord> ds = new ArrayList<>();
        ds.add(new FamilyWord("He has been very interested in doing research on ______ since he was at high school.","biology","biological","biologist","biologically","A"));
        ds.add(new FamilyWord("Are you sure that boys are more _____ than girls?","act","active","action","activity","B"));
        ds.add(new FamilyWord("You are old enough to take _____ for what you have done.","responsible","responsibility","responsibly","irresponsible","B"));
        ds.add(new FamilyWord("These quick and easy _____ can be effective in the short term, but they have a cost.","solve","solvable","solutions","solvability","C"));
        ds.add(new FamilyWord("He was looking at his parents ______, waiting for recommendations.","obey","obedience","obedient","obediently","D"));
        ds.add(new FamilyWord("The interviews with parents showed that the vast majority were _____ of teachers.","support","supportive","supporter","supporting","B"));
        ds.add(new FamilyWord("It is _____ of you to leave the medicine where the children could get it.","care","caring","careless","careful","C"));
        ds.add(new FamilyWord("For _____ reasons, passengers are requested not to leave any luggage unattended.","secure","securely","security","securing","A"));
        ds.add(new FamilyWord("The leader of the explorers had the great _____ in his native guide.","confident","confidence","confidential","confidentially","B"));
        ds.add(new FamilyWord("We are impressed by his _____ to help us with the hard mission.","will","willing","willingness","willingly","C"));
        ds.add(new FamilyWord("John cannot make a __ to get married to Mary or stay single until he can afford a house and a car","decide","decision","decisive","decisively","B"));
        ds.add(new FamilyWord("My mother used to be a woman of great _______, but now she gets old and looks pale","beauty","beautiful","beautifully","beautify","A"));
        ds.add(new FamilyWord("Although they are twins, they have almost the same appearance but they are seldom in _____","agree","agreeable","agreement","agreeably","C"));
        ds.add(new FamilyWord("The more _______ and positive you look, the better you will feel","confide","confident","confidently","confidence","B"));
        ds.add(new FamilyWord("My parents will have celebrated 30 years of _______ by next week","marry","married","marriageable","marriage","D"));
        ds.add(new FamilyWord("Many Vietnamese people ______ their lives for the revolutionary cause of the nation","sacrifice","sacrificed","sacrificial","sacrificially","A"));
        ds.add(new FamilyWord("They had a ______ candlelit dinner last night and she accepted his proposal of marriage","romance","sacrificed","romantically","romanticize","C"));
        ds.add(new FamilyWord("Are there any _____, between Vietnamese and American culture?","differences","different","differently","differential","A"));
        ds.add(new FamilyWord("Some people are concerned with physical _______when choosing a wife or husband","attractive","attraction","attractiveness","attractively","C"));
        ds.add(new FamilyWord("What could be more_______ than a wedding on a tropical island?","romance","romantic","romanticizing","romanticism","B"));
        ds.add(new FamilyWord("In my hometown, many people still believe in_______ marriage","contract","contractual","contracts","contracting","B"));
        ds.add(new FamilyWord("_____ women are responsible for the chores in the house and taking care of the children","With tradition","On tradition","Traditional","Traditionally","D"));
        ds.add(new FamilyWord("Though their performance was not perfect yet, the students held the audience's____ until the end","attentive","attention","attentively","attentiveness","B"));
        ds.add(new FamilyWord("The survey will cover various ways of ___________ the different attitudes toward love and marriage","determination","determine","determined","determining","A"));
        ds.add(new FamilyWord("Both Asian and Western students seem ___ about how to answer the questionnaire of the survey","confusedly","confused","confusing","confusion","B"));
        ds.add(new FamilyWord("She was__ unaware of the embarrassing situation due to her different cultural background","complete","completed","completing","completely","D"));
        ds.add(new FamilyWord("What is more important to you, intelligence or___________________?","attraction","attractiveness","attractive","attracted","B"));
        ds.add(new FamilyWord("The family has a very important role in_____________ children","social","socialist","socializing","socialism","C"));
        ds.add(new FamilyWord("In U.S. schools, teachers don't mind their students'___________ them during the lectures","interrupt","interrupted","interrupting","to interrupt","A"));
        ds.add(new FamilyWord("His achievements were partly due to the____________ of his wife.","assist","assistant","assisted","assistance","D"));
        ds.add(new FamilyWord("By working day and night, they succeeded____________ their work in time","finished","to finish","finishing","in finishing","B"));
        ds.add(new FamilyWord("They started, as ___ gatherings but they have become increasingly formalized in the last few years","informal","informally","informalize","informality","A"));
        ds.add(new FamilyWord("Children who are isolated and lonely seem to have poor language and ________","communicate","communication","communicative","communicator","B"));
        ds.add(new FamilyWord("The lecturer explained the problem very clearly and is always ____in response to questions","attention","attentive","attentively","attentiveness","B"));
        ds.add(new FamilyWord("It was very more __________of a chat than an interview.","formal","informal","formality","informality","B"));
        ds.add(new FamilyWord("As an _______, Mr. Pike is very worried about the increasing of juvenile delinquency","educate","education","educator","educative","C"));
        ds.add(new FamilyWord("In England, primary education is provided by state schools run by the government and by _______ feepaying schools","independent","independently","depended","independence","A"));
        ds.add(new FamilyWord("He did not do well at school and left with few _______ qualifications","academic","academy","academician","academically","A"));
        ds.add(new FamilyWord("The Minister of the Education and Training Department appeared on TV last night to_____his new policy","public","publicly","publicize","publicizing","C"));
        ds.add(new FamilyWord("He owed his success not to privilege but to self-education and a driving desire for _____.","achieve","achiever","achievement","achievable","C"));

        return ds;
    }

    public ArrayList<ChangeSentences> getDataChangeSentences()
    {
        ArrayList<ChangeSentences> ds = new ArrayList<>();
        ds.add(new ChangeSentences("Passive","He started learning French six years ago.",
                "He has learned French for six years.","It was six years ago did he start learning French.",
                "He hasn't learnt French for six years.","It is six years since he has learnt French.","A"));
        ds.add(new ChangeSentences("Passive","They stole my motorbike last night.",
                "My motorbike was stoling last night.","My motobike was stolen last night.",
                "My motorbike stolen last night.","Last night, My motorbike stole.","B"));
        ds.add(new ChangeSentences("Passive","An old woman feeds the pigeons.",
                "The pigeons are fed.","The pigeons fed by an old woman.",
                "The pigeons were fed by an old woman.","The pigeons were feeding by an old woman.","A"));
        ds.add(new ChangeSentences("Passive","Everyone is going to love her.",
                "She was loving by everyone.","She was going to be loved by everyone.",
                "She is going to be loved.","A & B.","C"));
        ds.add(new ChangeSentences("Passive","Pamela will drive the bus.",
                "The bus will been driven.","The bus will been drove by Pamela.",
                "The bus will be driven.","The bus will be driven by Pamela.","D"));
        ds.add(new ChangeSentences("Noun Phrase","He was sentenced to six months in prison for his part in the robbery","He received a six months in prison for his part in the robbery.","He received a six-month sentence for his part in the robbery.","For his participation in the robbery, he had been in prison for six months.","For his participation in the robbery, a prison had been given to him for six months.","B"));
        ds.add(new ChangeSentences("so as to/ in order to","Madeleine wears high heels to look taller.","In order to look taller, Madeleine wears high heels.","So that to look taller, Madeleine wears high heels.","Madeleine wants high heels to make her taller.","Madeleine buys high heels to look taller.","A"));
        ds.add(new ChangeSentences("Present Perfect","He started learning French six years ago.","He has learned French for six years.","It was six years ago did he start learning French.","He hasn’t learnt French for six years.","It is six years since he has learnt French.","A"));
        ds.add(new ChangeSentences("say/ think/ believe","People believed he won a lot of money on the lottery.","He is believed that he won a lot of money on the lottery.","He won a lot of money on the lottery, it is believed.","He is believed to have won a lot of money on the lottery.","He was believed to win a lot of money on the lottery.","C"));
        ds.add(new ChangeSentences("Reported Speech","“Leave my house now or I’ll call the police!” shouted the lady to the man.","The lady threatened to call the police if the man didn’t leave her house.","The lady said that she would call the police if the man didn’t leave her house.","The lady told the man that she would call the police if he didn’t leave her house.","The lady informed the man that she would call the police if he didn’t leave her house","A"));
        ds.add(new ChangeSentences("Reported Speech","“You should have finished the report by now” John told his secretary.","John reproached his secretary for not having finished the report.","John said that his secretary had not finished the report.","John reminded his secretary of finishing the report on time.","John scolded his secretary for not having finished the report","A"));
        ds.add(new ChangeSentences("Reported Speech","“I will pay back the money, Gloria.” Said Ivan.","Ivan apologized to Gloria for borrowing her money.","Ivan offered to pay Gloria the money back.","Ivan promised to pay back Gloria’s money.","Ivan suggested paying back the money to Gloria.","C"));
        ds.add(new ChangeSentences("Relative Clauses","The woman was too weak to lift the basket.","Although she was weak, she could lift the basket.","The woman shouldn't have lifted the basket because she was so weak.","She was so weak that she couldn't lift the basket.","The woman lifted the basket, so she wasn't very weak.","C"));
        ds.add(new ChangeSentences("Reported Speech","If I were you, I would take a break, Tom said to Daisy.","Tom wanted to take a break with Daisy.","Tom advised Daisy to take a break.","Tom suggested not taking a break.","Tom wanted to take a break, and so did Daisy.","B"));
        ds.add(new ChangeSentences("Conditional","They got success since they took my advice.","They took my advice, and failed.","If they did not take my advice, they would not get success.","But for taking my advice, they would not have got success.","My advice stopped them from getting success.","B"));
        ds.add(new ChangeSentences("Relative Clauses","I am very interested in the book you lent me last week.","The book is interesting enough for you to lend me last week.","It was the interesting book which you lent me last week.","The book which you lent me last week is too interesting to read.","The book that you lent me last week interests me a lot","D"));
        ds.add(new ChangeSentences("Closest","They did not let me in because I was not a member of the club.","They invited me although I was not a member of the club.","They did not allow me to enter because I was not a member of the club.","They invited me to the clubs as if I had been a member.","They asked me to get out of the club because I was not a member.","B"));
        ds.add(new ChangeSentences("Comparisons","His eel soup is better than any other soups I have ever eaten.","Of all the soups I have ever eaten, his eel soup is the best.","I have ever eaten many soups that are better than his eel soup.","His eel soup is the worst of all soups I have eaten.","His eel soup is good but I have ever eaten many others better.","A"));
        ds.add(new ChangeSentences("The last time/ The first time","The last time I went to the museum was a year ago.","I have not been to the museum for a year.","A year ago, I often went to the museum.","My going to the museum lasted a year.","At last I went to the museum after a year","A"));
        ds.add(new ChangeSentences("Closest","They are not allowed to go out in the evening by their parents.","Their parents do not want them to go out in the evening.","Their parents never let them to go out in the evening.","Going out in the evening is permitted by their parents.","Although their parents do not allow, they still go out in the evening.","A"));
        ds.add(new ChangeSentences("The last time/ The first time","This is the first time I attend such an enjoyable wedding party.","This is the first time I attend such an enjoyable wedding party.","I had the first enjoyable wedding party.","My attendance at the first wedding party was enjoyable.","I have never attended such an enjoyable wedding party before.","D"));
        ds.add(new ChangeSentences("The last time/ The first time","I have not met her for three years.","The last time I met her was three years ago.","It is three years when I will meet her.","I did not meet her three years ago.","During three years, I met her once.","A"));
        ds.add(new ChangeSentences("Reported Speech","How beautiful is the dress you have just bought! Peter said to Mary.","Peter promised to buy Mary a beautiful dress.","Peter said thanks to Mary for her beautiful dress.","Peter complimented Mary on her beautiful dress.","Peter asked Mary how she had just bought her beautiful dress.","C"));
        ds.add(new ChangeSentences("Closest","Barry continued to smoke even though we had advised him to quit.","Barry took our advice so he stopped smoking.","If we had advised Barry, he would have quit smoking.","Barry did not quit smoking because of our advice.","Despite being told not to smoke, Barry continued to do.","D"));
        ds.add(new ChangeSentences("Closest","Many people think Steve stole the money.","It was not Steve who stole the money.","Steve is thought to have stolen the money.","Many people think the money is stolen by Steve.","The money is thought to be stolen by Steve.","B"));
        ds.add(new ChangeSentences("Closest","Mary tried to keep calm although she was very disappointed.","Mary was too disappointed to keep calm.","Disappointed as she was, Mary tried to keep calm.","Mary lost her temper because of her disappointment.","Feeling disappointed, Mary tried to keep calm, but she failed.","B"));
        ds.add(new ChangeSentences("Closest","Even though it was raining heavily, the explorers decided to continue their journey.","It rained so heavily that the explorers could not continue their journey.","The explorers put off their journey due to the heavy rain.","The heavy rain could not prevent the explorers from continuing their journey.","If it had rained heavily, the explorers would not have continued their journey.","C"));
        ds.add(new ChangeSentences("Closest","Housewives do not have to spend a lot of time doing housework any more.","Housework will never be done by housewives any more.","Housewives have to spend more and more time to do housework.","Never have housewives spent as much time doing housework as they do now.","No longer do housewives have to spend a lot of time doing housework.","D"));
        ds.add(new ChangeSentences("Relative Clauses","Because it was an interesting novel, I stayed up all night to finish it.","I stayed up all night to finish the novel, therefore, it was interesting.","Unless it were an interesting novel, I would stay up all night to finish it.","Though it was an interesting novel, I stayed up all night to finish it.","So interesting was the novel that I stayed up all night to finish it.","D"));
        ds.add(new ChangeSentences("Relative Clauses","He cannot afford a new computer.","The new computer is so expensive that he cannot buy it.","Therefore, he would buy a new computer.","So, he would buy a new computer.","The new computer is so expensive but he can buy it.","A"));
        ds.add(new ChangeSentences("Closest","The roads were slippery because it snowed heavily.","It snowed too heavily to make the roads slippery.","The heavy snow prevented the roads from-being slippery.","Thanks to the slip of the roads, it snowed heavily.","The heavy snow made the roads slippery.","D"));
        ds.add(new ChangeSentences("Conditional","I did not understand what the lecturer was saying because I had not read his book.","What the lecturer wrote and said was too difficult for me to understand.","The lecturer's book which I had not read was difficult to understand.","I found it very difficult to understand what the lecturer said in his book.","I would have understood what the lecturer was saying if I had read his book.","D"));
        ds.add(new ChangeSentences("Relative Clauses","Because they made too many mistakes, they failed in the exam","They made very many mistakes that they failed in the exam","They made too many mistake for them to fail in the exam","They made so many mistakes that they failed in the exam","They made such many mistakes that they failed in the exam","D"));
        ds.add(new ChangeSentences("so as to/ in order to","She locked the door so as not to be disturbed","She locked the door in order that she wouldn’t be disturbed","She locked the door to be not disturbed","She locked the door for her not to be disturbed","She locked the door so that not to not to be disturbed","C"));
        ds.add(new ChangeSentences("Closest","Fewer people came to the meeting than we had expected","Too many people came to the meeting","There were more people at the meeting than we had expected","We had expected more people to come to the meeting","There were not enough seats for all people as we had expected","A"));

        return ds;
    }

    public ArrayList<BaiThiThu> getDataBaiThiThu()
    {
        ArrayList<BaiThiThu> ds = new ArrayList<>();
        ds.add(new BaiThiThu("Test 01",1));
        ds.add(new BaiThiThu("Test 02",2));
        ds.add(new BaiThiThu("Test 03",3));
        ds.add(new BaiThiThu("Test 04",4));
        ds.add(new BaiThiThu("Test 05",5));
        return ds;
    }

    public ArrayList<Part1> getDataPart1()
    {
        ArrayList<Part1> dsNghe = new ArrayList<>();
        dsNghe.add(new Part1("d1_p1_1.mp3","d1_p1_h1.png","A woman is painting a house.","A woman is watering a plant.","A woman is fixing a door.","A woman is sweeping a walkway.","","B", new BaiThiThu("Test 01",1)));

        dsNghe.add(new Part1("d2_p1_1.mp3","d2_p1_h1.png","She's wearing a hat","She's holding a coffee mug","She's washing her hands","She's putting up a sign","","C", new BaiThiThu("Test 02",2)));

        dsNghe.add(new Part1("d3_p1_1.mp3","d3_p1_h1.png","He's holding a book","He's hanging a clock","He's painting a picture","He's leaving a room","","B", new BaiThiThu("Test 03",3)));

        dsNghe.add(new Part1("d4_p1_1.mp3","d4_p1_h1.png","He's cutting a plece of bread","He's looking down at some notes","He's taking off an apron","He's putting some food in a basket","","B", new BaiThiThu("Test 04",4)));

        dsNghe.add(new Part1("d5_p1_1.mp3","d5_p1_h1.png","Some bags have been set on the floor","The woman is facing a fireplace","A flower basket is hanging from the ceiling","The woman is placing a binder on a table","","A", new BaiThiThu("Test 05",5)));

        return dsNghe;
    }

    public ArrayList<Nghe> getDataPart2()
    {
        ArrayList<Nghe> dsNghe = new ArrayList<>();
        dsNghe.add(new Nghe("d1_p2_7.mp3","2. Who wants to organize the patient files?","Min-Su would like to.","Our phone number has changed.","A well-run organization.","Outside of office 101.","","A", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p2_8.mp3","3. Why didn't Miranda shut down the computers yesterday?","Yes, my new laptop.","Outside of office 101.","Because she left early.","About five dollars.","","C", new BaiThiThu("Test 01",1)));

        dsNghe.add(new Nghe("d2_p2_7.mp3","2. What color should we paint the waiting room?","Let's paint it blue","Tomorrow should work","Yes, I filled the prescription","Mr.Bora does","","A", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p2_8.mp3","3. Who has the attendance sheet?","Mr.Bora does","I was just there yesterday","Out most recent event","Only ten dollars","","A", new BaiThiThu("Test 02",2)));

        dsNghe.add(new Nghe("d3_p2_7.mp3","2. Who's presenting at the sales meeting tomorrow?","Joseph is","All sales are final","The Mayfield Conference Room","I like hardwood floors","","A", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d3_p2_8.mp3","3. You haven't heard from the insurance agent, have you?","I like hardwood floors","An expired credit card","No, he hasn't called yet","That part was difficult","","A", new BaiThiThu("Test 03",3)));

        dsNghe.add(new Nghe("d4_p2_7.mp3","2. Who's in charge of the storeroom inventory?","Sure, sounds great","How much does it cost?","Ms.Kim takes care of it","We'll need sixteen folders","","C", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p2_8.mp3","3. Where's the filling cabinet?","We'll need sixteen folders","The pile on the shelf","Next to the water cooler","Early in the morning","","A", new BaiThiThu("Test 04",4)));

        dsNghe.add(new Nghe("d5_p2_7.mp3","2. What are your store hours today?","A. In the storege room","Nine A.M to six PM","Walnut Avenue","On the highest shelf","","B", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p2_8.mp3","3. Would you like to see the doctor on Monday or Tuesday?","My annual check-up","They're very patient","Tuesday works better","I'm so busy","","C", new BaiThiThu("Test 05",5)));

        return dsNghe;
    }

    public ArrayList<Nghe> getDataPart3()
    {
        ArrayList<Nghe> dsNghe = new ArrayList<>();
        dsNghe.add(new Nghe("d1_p3_32_34.mp3","4. Where is the conversation most likely taking place?","At a hardware store","At a clothing shop","At a bakery","At a pharmacy","","C", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p3_32_34.mp3","5. How do the speakers hope to increase sales?","By advertising online","By offering a new product","By providing free delivery","By discounting some items","","B", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p3_32_34.mp3","6. What will the man do next?","Contact a vendor","Talk to a colleague","File some invoices","Get some more supplies","","D", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p3_35_37.mp3","7. What does the woman say a town recently did?","It elected a mayor.","It fixed a train line.","It cleaned up a community park.","It added a bicycle lane.","","D", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p3_35_37.mp3","8. Why is the woman pleased about a change?","Her monthly bills are lower.","Her commute is quicker.","Recycling is easier.","A neighborhood looks nicer.","","B", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p3_35_37.mp3","9. What does the man suggest the woman do?","Join a club","Enter a competition","Check an agenda","Post a review","","A", new BaiThiThu("Test 01",1)));
        
        dsNghe.add(new Nghe("d2_p3_32_34.mp3","4. What does the man say he plans to do today?","Go sightseeing","Attend a conference","Purchase some gifts","Stop at a bank","","A", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p3_32_34.mp3","5. What does the man ask about?","Internet access","Use of a fitness center","Transportation options","Nearby restaurants","","C", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p3_32_34.mp3","6. What does the woman offer to do?","Make a reservation","Print a parking pass","Provide a password","Check on some prices","","D", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p3_35_37.mp3","7. What did the man do before coming in to work?","He met with a friend","He revised a menu","He read a newspaper","He bought some breakfast","","B", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p3_35_37.mp3","8. What does the man think will happen this week?","There will be more customer","There will be a safety inspection","A contract will be renewed","A new chef will be hired","","A", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p3_35_37.mp3","9. What will the women most likely do next?","Hire additional staff","Schedule some repairs","Place an order","Print an article","","C", new BaiThiThu("Test 02",2)));

        dsNghe.add(new Nghe("d2_p3_32_34.mp3","4. Where is the conversation most likely taking place?","At a supermarket","At an auto shop","At a travel agency","At a hotel","","D", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p3_32_34.mp3","5. What problem does the woman mention?","A bill is not correct","A repair is not finished","A reversation was not available","A staff member was not polite","","A", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p3_32_34.mp3","6. Where will the woman go next?","To a client's office","To the airport","To a shopping center","To a museum","","B", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p3_35_37.mp3","7. What did the woman order from the man's company?","Machine parts","Cleaning supplies","Some tickets","Some computers","","A", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p3_35_37.mp3","8. Why is the woman pleased?","Some service fees have decreased","Some product tests were successul","A musical performance has been scheduled","A business competitor has left the industry","","B", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p3_35_37.mp3","9. What does the woman ask about?","The date of a delivery","The size of a venue","Business hours","Discounts on an order","","D", new BaiThiThu("Test 03",3)));

        dsNghe.add(new Nghe("d4_p3_32_34.mp3","4. What did the man recently do?","He changed his diet","He moved to a new town","He won a sports competition","He opened a business","","B", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p3_32_34.mp3","5. What are the speakers mainly discussing?","A free trial period","Customer reviews","Job qualifications","A certification course","","A", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p3_32_34.mp3","6. What does the woman give to the man?","A coupon","A map","A schedule","A form","","C", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p3_35_37.mp3","7. Where does the conversation most likely take place?","At a rental car agency","At a shopping mall","At a concert hall"," At a train station","","D", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p3_35_37.mp3","8. What does the man inquire about?","Storing some luggage","Purchasing a ticket","Accessing the Internet","Finding a bus stop","","A", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p3_35_37.mp3","9. What will the man most likely do next?","Print a receipt","Go to a hotel","Make a telephone call","Purchase some souvenirs","","B", new BaiThiThu("Test 04",4)));

        dsNghe.add(new Nghe("d5_p3_32_34.mp3","4. Who most likely is the woman?","A delivery driver","A bank teller","A store cashier","A graphic designer","","C", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p3_32_34.mp3","5. Why does the woman apologize?","Her manager is not available","A coupon has expired","A fee has increased","A package is missing","","B", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p3_32_34.mp3","6. What does the woman recommend that the man do?","Return the next day","Register for a membership program","Read some instructions","Request technical support","","B", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p3_35_37.mp3","7. What does the woman ask about?","Making travel arrangement","Leading a workshop","Ordering promotional materials","Practicing a sales presentation","","A", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p3_35_37.mp3","8. What does the man suggest the woman do after the conference?","Purchase some equipment","Meet with a client","Visit a museum","Interview some job candidates","","B", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p3_35_37.mp3","9. What will the man send to the woman?","A reimbursement form","A confirmation code","A telephone number","An e-mail address","","D", new BaiThiThu("Test 05",5)));

        return dsNghe;
    }

    public ArrayList<Nghe> getDataPart4()
    {
        ArrayList<Nghe> dsNghe = new ArrayList<>();
        dsNghe.add(new Nghe("d1_p4_71_73.mp3","10. According to the speaker, what will take place on Saturday?","A retirement party","A holiday parade","A business workshop","A company picnic","","B", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p4_71_73.mp3","11. Where do the listeners work?","At a bank","At an amusement park","At a restaurant","At a police station","","C", new BaiThiThu("Test 01",1)));
        dsNghe.add(new Nghe("d1_p4_71_73.mp3","12. What does the speaker suggest that the listeners do?","Wear warm clothing","Use public transportation","Pack a lunch","Bring identification","","B", new BaiThiThu("Test 01",1)));

        dsNghe.add(new Nghe("d2_p4_71_73.mp3","10. What type of prodcut is being discussed?","A coffee maker","A microwave oven","A portable heater","A water filter","","A", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p4_71_73.mp3","11. What is the purpose of ther advertisement?","To reveal a product release date","To announce a talent show","To find volunteers for a focus group","To explain details of a warranty","","C", new BaiThiThu("Test 02",2)));
        dsNghe.add(new Nghe("d2_p4_71_73.mp3","12. What bonus is mentioned?","A raffle ticket","A coupon","Travel reimbursement","Free shipping","","B", new BaiThiThu("Test 02",2)));

        dsNghe.add(new Nghe("d2_p4_71_73.mp3","10. What is the speakers mainly discussing?","Company goals","A software propram","A vaction policy","Salary increases","","B", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p4_71_73.mp3","11. What improvement does the speakers mention?","Employees can work from any location","More staff will be assigned to a project","Department budgets have increased","Time on projects will be reported accurately","","D", new BaiThiThu("Test 03",3)));
        dsNghe.add(new Nghe("d2_p4_71_73.mp3","12. What will Michaela do next?","Give a demostration","Present survey results","Explain a project timeline","Answer employee questions","","A", new BaiThiThu("Test 03",3)));

        dsNghe.add(new Nghe("d4_p4_71_73.mp3","10. What news does the speaker provide about the company?","A second location will be opening","A new product has been developed","An important customer has signed a contract","A team will attend aconference","","A", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p4_71_73.mp3","11. According to the speaker, what do the listeners have the opportunity to do?","Conduct some research","Take a certification course","Present at a conference","Become a manager","","D", new BaiThiThu("Test 04",4)));
        dsNghe.add(new Nghe("d4_p4_71_73.mp3","12. What does the speaker suggest some listeners do?","Visit a Web site","Sign an attendance sheet","Stay after the meeting","E-mail an administrator","","C", new BaiThiThu("Test 04",4)));

        dsNghe.add(new Nghe("d5_p4_71_73.mp3","10. What does speakers say she did last Friday?","She stayed late at the office","She installed some new software","She attended an investor meeting","She presented at an enviromental conference","","A", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p4_71_73.mp3","11. What does the speaker request that the listeners do?","Keep their work spaces clean","Turn off their lamps", "Read a list of suggestions","Participate in a video conference","","B", new BaiThiThu("Test 05",5)));
        dsNghe.add(new Nghe("d5_p4_71_73.mp3","12. Why does the speaker congratulate the listeners?","For meeting sales goals","For a product launch","For completing a difficult project","For a successful recycling program","","D", new BaiThiThu("Test 05",5)));

        return dsNghe;
    }

    public ArrayList<DocHieu> getDataPart5()
    {
        ArrayList<DocHieu> dsDocHieu = new ArrayList<>();
        dsDocHieu.add(new DocHieu("13. Departmental restructuring will be discussed at the _____ monthly meeting.","next","always","soon","like","","A", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("14. To keep _____ park beautiful, please place your nonrecyclables in the available trash cans.","our","we","us","ours","","A", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("15. Mr. Hardin _____ additional images of the office building he is interested in leasing.","informed","asked","advised","requested","","D", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("16. A team of agricultural experts will be brought _____ to try to improve crop harvests.","because","either","between","together","","D", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("17. The board of Galaxipharm _____ Mr. Kwon's successor at yesterday's meeting.","named","granted","founded","proved","","A", new BaiThiThu("Test 01",1)));

        dsDocHieu.add(new DocHieu("13. Mr. Sokolov_____a positive review of this stay at the Olana Hotel","write","wrote","writing","was written","","B", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("14. The manager often leads new employees through the safety procedures_____","her","herself","hers","she","","B", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("15. The corporate fitness center is equipped_____fourteen stationary bicycles","at","on","with","about","","C", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("16. Professor Phuong will go over the use of the laboratory____with the interns next week","instruments","instrumental","instrumentally","instrumented","","A", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("17. Arnby Cable_____$25.00 to all Internet subscribers after the weeklong service interruption","refunded","accepted","divided","deposited","","A", new BaiThiThu("Test 02",2)));

        dsDocHieu.add(new DocHieu("13. The Pangea Company will send _____ an e-mail comfirming receipt of the application","your","yourselves","Yourself","you","","D", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("14. Mr. Yamamoto's farewell party was____in the cafeteria on Tuesday","meant","held","taken","build","","B", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("15. Tours run every day, but there may be ____ avaiability on weekends","limit","limits","limited","limitation","","C", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("16. Bentoc Shoes has a loyal customers base ____ it provides high-quality service","because","rather","not only","as well","","A", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("17. Building management____ asks employees to avoid socializing in the lobby","respects","respected","respectful","respectfully","","D", new BaiThiThu("Test 03",3)));

        dsDocHieu.add(new DocHieu("13. ____ is currently Ms. Wonderle's first year working as our office's administrative assistant","This","that","These","Those","","A", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("14. Riversedge City is ______ to announce new monthly parking discounts for its residents","pleasing","pleasure","please","pleased","","D", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("15. Sang-Hoon Park is retiring after 25 years of ____ with Dahl Legal Consultants","service","profession","knowledge","relationship","","A", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("16. The Trails Store will ___ add a section for hiking equipment","eventualities","eventual","eventually","eventuality","","C", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("17. Puraforce Staffing can provide your business ____ temporary employees during the busy holiday season","from","with","about","into","","B", new BaiThiThu("Test 04",4)));

        dsDocHieu.add(new DocHieu("13. Free Internet service ____ available in the lobby but not in the guest rooms","being","to be","are","is","","D", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("14. A third branch ____ Starshom Hair Salon will open in Georgetown's industrial district","up","of","a long","in","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("15. The March shipment to Busan can fit an ____ thirteen containers","adding","additional","addition","add","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("16. Ms. Tran ____ the clients fifteen different apartments in one afternoon","made","opened","passed","showed","","D", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("17. Mr. Sweeney is most pleased when ____ press releases are published unedited","he","him","his","himself","","C", new BaiThiThu("Test 05",5)));

        return dsDocHieu;
    }

    public ArrayList<DocHieu> getDataPart6()
    {
        ArrayList<DocHieu> dsDocHieu = new ArrayList<>();
        dsDocHieu.add(new DocHieu("18. Lakeview Railway Onboard Bicycle Policy Would you like to use your bicycle to explore the Lakeview Corridor Scenic Area?Our trains have the _____(18) you need to safely transport your bike. When booking your ticket, just remember that reservations _____(19) for both you and your bicycle. Reserve your bicycle spot _____(20). There are a limited number of storage racks on each train. You are responsible for stowing your bike securely. _____(21). Lakeview Railway does not take responsibility for bicycles lost or damaged aboard our trains.","stock","equipment","property","revenue","","B", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("19. Lakeview Railway Onboard Bicycle Policy Would you like to use your bicycle to explore the Lakeview Corridor Scenic Area?Our trains have the _____(18) you need to safely transport your bike. When booking your ticket, just remember that reservations _____(19) for both you and your bicycle. Reserve your bicycle spot _____(20). There are a limited number of storage racks on each train. You are responsible for stowing your bike securely. _____(21). Lakeview Railway does not take responsibility for bicycles lost or damaged aboard our trains.","require","requiring","are required","were required","","C", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("20. Lakeview Railway Onboard Bicycle Policy Would you like to use your bicycle to explore the Lakeview Corridor Scenic Area?Our trains have the _____(18) you need to safely transport your bike. When booking your ticket, just remember that reservations _____(19) for both you and your bicycle. Reserve your bicycle spot _____(20). There are a limited number of storage racks on each train. You are responsible for stowing your bike securely. _____(21). Lakeview Railway does not take responsibility for bicycles lost or damaged aboard our trains.","early","again","more","instead","","A", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new DocHieu("21. Lakeview Railway Onboard Bicycle Policy Would you like to use your bicycle to explore the Lakeview Corridor Scenic Area?Our trains have the _____(18) you need to safely transport your bike. When booking your ticket, just remember that reservations _____(19) for both you and your bicycle. Reserve your bicycle spot _____(20). There are a limited number of storage racks on each train. You are responsible for stowing your bike securely. _____(21). Lakeview Railway does not take responsibility for bicycles lost or damaged aboard our trains.","Folding bicycles have become more common.","Additional service fees may apply.","You can obtain route maps at most stations.","You must also supply your own bike lock.","","D", new BaiThiThu("Test 01",1)));

        dsDocHieu.add(new DocHieu("18. The Design Present Conference is an annual event held in Melbourne for graphic-design professionals. The conference is steadily growing in popularity. Last year, it_____(18)more than 3,000 attendees from Australia and around the world. The next Design Present Conference, which will\n" +
                "                be held from 20 to 23 March, will offer more than 100 workshops, plus keynote speeches and\n" +
                "                plenary sessions. This year, several opportunities for professional networking will be added. Attendees will have the chance to market_____(19)firms in several different industries. Periods for networking will be included in the_____(20)each day. Whether you are a design enthusiast, student, freelance designer, or business owner, Design Present has something for you._____(21).\n" +
                "        ","attracted","entered","awarded","promoted","","A", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("19. The Design Present Conference is an annual event held in Melbourne for graphic-design professionals. The conference is steadily growing in popularity. Last year, it_____(18)more than 3,000 attendees from Australia and around the world. The next Design Present Conference, which will\n" +
                "                be held from 20 to 23 March, will offer more than 100 workshops, plus keynote speeches and\n" +
                "                plenary sessions. This year, several opportunities for professional networking will be added. Attendees will have the chance to market_____(19)firms in several different industries. Periods for networking will be included in the_____(20)each day. Whether you are a design enthusiast, student, freelance designer, or business owner, Design Present has something for you._____(21).\n" +
                "        ","they","them","themselves","theirs","","C", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("20. The Design Present Conference is an annual event held in Melbourne for graphic-design professionals. The conference is steadily growing in popularity. Last year, it_____(18)more than 3,000 attendees from Australia and around the world. The next Design Present Conference, which will\n" +
                "                be held from 20 to 23 March, will offer more than 100 workshops, plus keynote speeches and\n" +
                "                plenary sessions. This year, several opportunities for professional networking will be added. Attendees will have the chance to market_____(19)firms in several different industries. Periods for networking will be included in the_____(20)each day. Whether you are a design enthusiast, student, freelance designer, or business owner, Design Present has something for you._____(21).\n" +
                "        ","location","situation","machine","schedule","","D", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new DocHieu("21. The Design Present Conference is an annual event held in Melbourne for graphic-design professionals. The conference is steadily growing in popularity. Last year, it_____(18)more than 3,000 attendees from Australia and around the world. The next Design Present Conference, which will\n" +
                "                be held from 20 to 23 March, will offer more than 100 workshops, plus keynote speeches and\n" +
                "                plenary sessions. This year, several opportunities for professional networking will be added. Attendees will have the chance to market_____(19)firms in several different industries. Periods for networking will be included in the_____(20)each day. Whether you are a design enthusiast, student, freelance designer, or business owner, Design Present has something for you._____(21).\n" +
                "        ","Registration begin on 3 February and continues through 18 March","This speaker is well-known throughout the industry","The conference was held in New Zealand in previous years","We'd like to get your feedback on last year's conference","","A", new BaiThiThu("Test 02",2)));


        dsDocHieu.add(new DocHieu("18. Berestoff Ltd._____(18)a professional procurement officer to oversee bidding and procurement processes in all company departments. This employee will draft advertisements, prepare contract documents, process bids,_____(19)provide training on policy and procedures to company personnel.\n" +
                "                The position requires a two-year degree in business administration or a related field. The_____(20)must have a minimum of three years experience as an office manager in a corporate environment,\n" +
                "                including recent experience in procurement._____(21)","seeks","hires","offers","trains","","A", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("19. Berestoff Ltd._____(18)a professional procurement officer to oversee bidding and procurement processes in all company departments. This employee will draft advertisements, prepare contract documents, process bids,_____(19)provide training on policy and procedures to company personnel.\n" +
                "                        The position requires a two-year degree in business administration or a related field. The_____(20)must have a minimum of three years experience as an office manager in a corporate environment,\n" +
                "                        including recent experience in procurement._____(21)","so","while","nor","and","","D", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("20. Berestoff Ltd._____(18)a professional procurement officer to oversee bidding and procurement processes in all company departments. This employee will draft advertisements, prepare contract documents, process bids,_____(19)provide training on policy and procedures to company personnel.\n" +
                "                        The position requires a two-year degree in business administration or a related field. The_____(20)must have a minimum of three years experience as an office manager in a corporate environment,\n" +
                "                        including recent experience in procurement._____(21)","application","applicant","applying","apply","","B", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new DocHieu("21. Berestoff Ltd._____(18)a professional procurement officer to oversee bidding and procurement processes in all company departments. This employee will draft advertisements, prepare contract documents, process bids,_____(19)provide training on policy and procedures to company personnel.\n" +
                "                        The position requires a two-year degree in business administration or a related field. The_____(20)must have a minimum of three years experience as an office manager in a corporate environment,\n" +
                "                        including recent experience in procurement._____(21)","Likewise, company-owned cars are a major expense for firms such as ours","Moreover, excellent organizational skills are essential","The top candidate for the position has been offered a one-year contract","All employees have been notified of the policy change","","B", new BaiThiThu("Test 03",3)));


        dsDocHieu.add(new DocHieu("18. Hollydale Medical Center\n" +
                "                To All Office Staff:\n" +
                "        The move to our new medical center building will take place this weekend_____(18). 79, all items in your desks must be packed before the end of the day on Friday. The empty boxes_____(19) to you by 8:00 A.M. on Thursday. When you arrive at our new location on Monday morning, your boxes should already be in your new office. _____(20). If you will be out of the office this Thursday or Friday, notify me immediately so we can make other arrangements.\n" +
                "        We appreciate your cooperation in helping to make this transition to our new location go as_____(21) as possible.\n" +
                "        Jian Tang, Office Manager\n" +
                "        ","regular","regulars","regularly","regulate","","A", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("19. Hollydale Medical Center\n" +
                "                To All Office Staff:\n" +
                "        The move to our new medical center building will take place this weekend_____(18). 79, all items in your desks must be packed before the end of the day on Friday. The empty boxes_____(19) to you by 8:00 A.M. on Thursday. When you arrive at our new location on Monday morning, your boxes should already be in your new office. _____(20). If you will be out of the office this Thursday or Friday, notify me immediately so we can make other arrangements.\n" +
                "        We appreciate your cooperation in helping to make this transition to our new location go as_____(21) as possible.\n" +
                "        Jian Tang, Office Manager\n" +
                "        ","Continuing","Deciding","Failling","Paying","","C", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("20. Hollydale Medical Center\n" +
                "                To All Office Staff:\n" +
                "        The move to our new medical center building will take place this weekend_____(18). 79, all items in your desks must be packed before the end of the day on Friday. The empty boxes_____(19) to you by 8:00 A.M. on Thursday. When you arrive at our new location on Monday morning, your boxes should already be in your new office. _____(20). If you will be out of the office this Thursday or Friday, notify me immediately so we can make other arrangements.\n" +
                "        We appreciate your cooperation in helping to make this transition to our new location go as_____(21) as possible.\n" +
                "        Jian Tang, Office Manager\n" +
                "        ","Withing the next few days, notifications will be sent out","They are required even if no defect is discovered","It has been found on a number of occasions","Time off may be requested a week in advance","","B", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new DocHieu("21. Hollydale Medical Center\n" +
                "                To All Office Staff:\n" +
                "        The move to our new medical center building will take place this weekend_____(18). 79, all items in your desks must be packed before the end of the day on Friday. The empty boxes_____(19) to you by 8:00 A.M. on Thursday. When you arrive at our new location on Monday morning, your boxes should already be in your new office. _____(20). If you will be out of the office this Thursday or Friday, notify me immediately so we can make other arrangements.\n" +
                "        We appreciate your cooperation in helping to make this transition to our new location go as_____(21) as possible.\n" +
                "        Jian Tang, Office Manager\n" +
                "        ","directly","smoothly","slowly","actively","","B", new BaiThiThu("Test 04",4)));

        dsDocHieu.add(new DocHieu("18. You are receiving this e-mail _____ (18) you have contacted Breil Home in the past about our\n" +
                "houseware products or have visited our Web site. If you no longer wish to receive our e-mails,\n" +
                "you can be removed from our list. _____(19). But do you really want to miss out on discount offers for\n" +
                "products that will help you turn your house into an _____(20) home? We hope you will choose to\n" +
                "remain a subscriber so that we can continue to send _____ (21) for the most popular new products for\n" +
                "your home.",
                "even","because","during","among","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("19. You are receiving this e-mail _____ (18) you have contacted Breil Home in the past about our\n" +
                "houseware products or have visited our Web site. If you no longer wish to receive our e-mails,\n" +
                "you can be removed from our list. _____(19). But do you really want to miss out on discount offers for\n" +
                "products that will help you turn your house into an _____(20) home? We hope you will choose to\n" +
                "remain a subscriber so that we can continue to send _____ (21) for the most popular new products for\n" +
                "your home.",
                "Simple reply to this e-mail with the word \"unsubscribe\"","The issue has not yet been resolved","Please provide your order number","Our products are made by local artisans using natural materials","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("20. You are receiving this e-mail _____ (18) you have contacted Breil Home in the past about our\n" +
                "houseware products or have visited our Web site. If you no longer wish to receive our e-mails,\n" +
                "you can be removed from our list. _____(19). But do you really want to miss out on discount offers for\n" +
                "products that will help you turn your house into an _____(20) home? We hope you will choose to\n" +
                "remain a subscriber so that we can continue to send _____ (21) for the most popular new products for\n" +
                "your home.",
                "invites","invited","inviting","invitation","","C", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new DocHieu("21. You are receiving this e-mail _____ (18) you have contacted Breil Home in the past about our\n" +
                "houseware products or have visited our Web site. If you no longer wish to receive our e-mails,\n" +
                "you can be removed from our list. _____(19). But do you really want to miss out on discount offers for\n" +
                "products that will help you turn your house into an _____(20) home? We hope you will choose to\n" +
                "remain a subscriber so that we can continue to send _____ (21) for the most popular new products for\n" +
                "your home.",
                "pieces","contracts","samples","coupons","","D", new BaiThiThu("Test 05",5)));

        return dsDocHieu;
    }

    public ArrayList<Part7> getDataPart7()
    {
        ArrayList<Part7> dsDocHieu = new ArrayList<>();
        dsDocHieu.add(new Part7("Monday, 8 May\n" +
                "Gabriel Li (9:10 A.M.)\tGood morning, everyone. I want to remind you that Larkin Landscaping will be here at Derryco tomorrow morning to remove the trees from the front parking area. My workers will block off the area before the contractor arrives, so you and your staff should plan to find parking elsewhere or use public transit.\n" +
                "Ava Abberton (9:11 A.M.)\tI have a client, Jan McGonagle, who will be driving in from Belfast to meet with me at 10:00 A.M. What should I tell her? Can she contact the facilities department?\n" +
                "Martin Beattie (9:12 A.M.)\tThere's heavy rain in the forecast. Are you sure the tree work will go forward?\n" +
                "Gabriel Li (9:13 A.M.)\tYes, give Ms. McGonagle my mobile phone number and have her call me when she arrives. I will direct her around the back. The spots there will be reserved for visitors only.\n" +
                "Gabriel Li (9:14 A.M.)\tAnd yes, Larkin assured me the crew comes out rain or shine.\n" +
                "Daniel Deegan (9:15 A.M.)\tRemember, too, that we can approve team members to work from home tomorrow. Just make sure that all conference calls are listed on the master schedule on the intranet.\n" +
                "Gabriel Li (9:16 A.M.)\tRight. Thank you, all.",
                "22. Who most likely is Mr. Li?","A landscaping crew member","A delivery coordinator","A warehouse worker","A facilities supervisor","","D", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("Monday, 8 May\n" +
                "Gabriel Li (9:10 A.M.)\tGood morning, everyone. I want to remind you that Larkin Landscaping will be here at Derryco tomorrow morning to remove the trees from the front parking area. My workers will block off the area before the contractor arrives, so you and your staff should plan to find parking elsewhere or use public transit.\n" +
                "Ava Abberton (9:11 A.M.)\tI have a client, Jan McGonagle, who will be driving in from Belfast to meet with me at 10:00 A.M. What should I tell her? Can she contact the facilities department?\n" +
                "Martin Beattie (9:12 A.M.)\tThere's heavy rain in the forecast. Are you sure the tree work will go forward?\n" +
                "Gabriel Li (9:13 A.M.)\tYes, give Ms. McGonagle my mobile phone number and have her call me when she arrives. I will direct her around the back. The spots there will be reserved for visitors only.\n" +
                "Gabriel Li (9:14 A.M.)\tAnd yes, Larkin assured me the crew comes out rain or shine.\n" +
                "Daniel Deegan (9:15 A.M.)\tRemember, too, that we can approve team members to work from home tomorrow. Just make sure that all conference calls are listed on the master schedule on the intranet.\n" +
                "Gabriel Li (9:16 A.M.)\tRight. Thank you, all.",
                "23. Why will Ms. McGonagle contact Mr. Li?","To schedule a visit with him","To obtain parking assistance","To get a list of directions to the office","To advise him of transit delays","","B", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("Monday, 8 May\n" +
                "Gabriel Li (9:10 A.M.)\tGood morning, everyone. I want to remind you that Larkin Landscaping will be here at Derryco tomorrow morning to remove the trees from the front parking area. My workers will block off the area before the contractor arrives, so you and your staff should plan to find parking elsewhere or use public transit.\n" +
                "Ava Abberton (9:11 A.M.)\tI have a client, Jan McGonagle, who will be driving in from Belfast to meet with me at 10:00 A.M. What should I tell her? Can she contact the facilities department?\n" +
                "Martin Beattie (9:12 A.M.)\tThere's heavy rain in the forecast. Are you sure the tree work will go forward?\n" +
                "Gabriel Li (9:13 A.M.)\tYes, give Ms. McGonagle my mobile phone number and have her call me when she arrives. I will direct her around the back. The spots there will be reserved for visitors only.\n" +
                "Gabriel Li (9:14 A.M.)\tAnd yes, Larkin assured me the crew comes out rain or shine.\n" +
                "Daniel Deegan (9:15 A.M.)\tRemember, too, that we can approve team members to work from home tomorrow. Just make sure that all conference calls are listed on the master schedule on the intranet.\n" +
                "Gabriel Li (9:16 A.M.)\tRight. Thank you, all.",
                "24. What is likely to happen on May 9?","Some Derryco employees will work at home.","Derryco will be closed for business.","Ms. McGonagle will stay in a local hotel.","Mr. Deegan will cancel a conference call.","","A", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("Monday, 8 May\n" +
                "Gabriel Li (9:10 A.M.)\tGood morning, everyone. I want to remind you that Larkin Landscaping will be here at Derryco tomorrow morning to remove the trees from the front parking area. My workers will block off the area before the contractor arrives, so you and your staff should plan to find parking elsewhere or use public transit.\n" +
                "Ava Abberton (9:11 A.M.)\tI have a client, Jan McGonagle, who will be driving in from Belfast to meet with me at 10:00 A.M. What should I tell her? Can she contact the facilities department?\n" +
                "Martin Beattie (9:12 A.M.)\tThere's heavy rain in the forecast. Are you sure the tree work will go forward?\n" +
                "Gabriel Li (9:13 A.M.)\tYes, give Ms. McGonagle my mobile phone number and have her call me when she arrives. I will direct her around the back. The spots there will be reserved for visitors only.\n" +
                "Gabriel Li (9:14 A.M.)\tAnd yes, Larkin assured me the crew comes out rain or shine.\n" +
                "Daniel Deegan (9:15 A.M.)\tRemember, too, that we can approve team members to work from home tomorrow. Just make sure that all conference calls are listed on the master schedule on the intranet.\n" +
                "Gabriel Li (9:16 A.M.)\tRight. Thank you, all.",
                "25. At 9:14 A.M., what does Mr. Li mean when he writes, 'the crew comes out rain or shine'?","The weather forecast is probably wrong.","Larkin Landscaping employs an outstanding group of workers","Derryco employees should prepare for bad weather.","The outdoor work will proceed as scheduled.","","D", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("September 18         \n" +
                "\n" +
                "I used Bright Now Home's new in-store customer pickup for the first time this week. The service was a big time-saver because my order was ready for me when I got to the store. Since I had already paid online, I didn't have to wait in the regular line in the store.     \n" +
                "\n" +
                "Unfortunately, I didn't double-check my order before I left the store. When I arrived at the house I was working on, I realized I had received only one of the two gallons of BN-101 paint I had ordered. I called the store immediately, and the manager arranged for me to pick up the missing gallon of paint at the location closest to where I was working. Also, he gave me my money back for both gallons. I will definitely use this service again!    \n" +
                "\n" +
                "Jesse Beeby Mr.Beeby,\n" +
                "\n" +
                "We are glad to have served your business recently. We saw the comments you posted about us on uopine.com, and we are grateful to you. It was nice to hear that our flagship location was so convenient to your work site and that you were able to pick up your missing paint there.\n" +
                "\n" +
                "We stand behind our products and services and look forward to seeing you again soon. After all, the rainy season is almost here, so now is a great time to come in and get the tools you need for those upcoming roof jobs!\n" +
                "\n" +
                "Hattie Jones\n" +
                "Customer Service Manager\n" +
                "Bright Now Home",
                "26. What most likely is Mr. Beeby's job?","Salesclerk","Housepainter","Delivery driver","Real estate agent","","B", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("September 18         \n" +
                "\n" +
                "I used Bright Now Home's new in-store customer pickup for the first time this week. The service was a big time-saver because my order was ready for me when I got to the store. Since I had already paid online, I didn't have to wait in the regular line in the store.     \n" +
                "\n" +
                "Unfortunately, I didn't double-check my order before I left the store. When I arrived at the house I was working on, I realized I had received only one of the two gallons of BN-101 paint I had ordered. I called the store immediately, and the manager arranged for me to pick up the missing gallon of paint at the location closest to where I was working. Also, he gave me my money back for both gallons. I will definitely use this service again!    \n" +
                "\n" +
                "Jesse Beeby Mr.Beeby,\n" +
                "\n" +
                "We are glad to have served your business recently. We saw the comments you posted about us on uopine.com, and we are grateful to you. It was nice to hear that our flagship location was so convenient to your work site and that you were able to pick up your missing paint there.\n" +
                "\n" +
                "We stand behind our products and services and look forward to seeing you again soon. After all, the rainy season is almost here, so now is a great time to come in and get the tools you need for those upcoming roof jobs!\n" +
                "\n" +
                "Hattie Jones\n" +
                "Customer Service Manager\n" +
                "Bright Now Home",
                "27. What item did Mr. Beeby need more of? ?","Coastland Gray","Linwall Gray","Brightwyn Green","Foxdell Green","","A", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("September 18         \n" +
                "\n" +
                "I used Bright Now Home's new in-store customer pickup for the first time this week. The service was a big time-saver because my order was ready for me when I got to the store. Since I had already paid online, I didn't have to wait in the regular line in the store.     \n" +
                "\n" +
                "Unfortunately, I didn't double-check my order before I left the store. When I arrived at the house I was working on, I realized I had received only one of the two gallons of BN-101 paint I had ordered. I called the store immediately, and the manager arranged for me to pick up the missing gallon of paint at the location closest to where I was working. Also, he gave me my money back for both gallons. I will definitely use this service again!    \n" +
                "\n" +
                "Jesse Beeby Mr.Beeby,\n" +
                "\n" +
                "We are glad to have served your business recently. We saw the comments you posted about us on uopine.com, and we are grateful to you. It was nice to hear that our flagship location was so convenient to your work site and that you were able to pick up your missing paint there.\n" +
                "\n" +
                "We stand behind our products and services and look forward to seeing you again soon. After all, the rainy season is almost here, so now is a great time to come in and get the tools you need for those upcoming roof jobs!\n" +
                "\n" +
                "Hattie Jones\n" +
                "Customer Service Manager\n" +
                "Bright Now Home",
                "28. Where did Mr. Beeby pick up the item missing from his order?","At the northwest store","At the northeast store","At the southwest store","At the southeast store","","D", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("September 18         \n" +
                "\n" +
                "I used Bright Now Home's new in-store customer pickup for the first time this week. The service was a big time-saver because my order was ready for me when I got to the store. Since I had already paid online, I didn't have to wait in the regular line in the store.     \n" +
                "\n" +
                "Unfortunately, I didn't double-check my order before I left the store. When I arrived at the house I was working on, I realized I had received only one of the two gallons of BN-101 paint I had ordered. I called the store immediately, and the manager arranged for me to pick up the missing gallon of paint at the location closest to where I was working. Also, he gave me my money back for both gallons. I will definitely use this service again!    \n" +
                "\n" +
                "Jesse Beeby Mr.Beeby,\n" +
                "\n" +
                "We are glad to have served your business recently. We saw the comments you posted about us on uopine.com, and we are grateful to you. It was nice to hear that our flagship location was so convenient to your work site and that you were able to pick up your missing paint there.\n" +
                "\n" +
                "We stand behind our products and services and look forward to seeing you again soon. After all, the rainy season is almost here, so now is a great time to come in and get the tools you need for those upcoming roof jobs!\n" +
                "\n" +
                "Hattie Jones\n" +
                "Customer Service Manager\n" +
                "Bright Now Home",
                "29. What is indicated about Bright Now Home?","It has design experts in stores.","It provides same-day delivery service.","It sells supplies for building maintenance.","It offers coupons on its Web site.","","C", new BaiThiThu("Test 01",1)));
        dsDocHieu.add(new Part7("September 18         \n" +
                "\n" +
                "I used Bright Now Home's new in-store customer pickup for the first time this week. The service was a big time-saver because my order was ready for me when I got to the store. Since I had already paid online, I didn't have to wait in the regular line in the store.     \n" +
                "\n" +
                "Unfortunately, I didn't double-check my order before I left the store. When I arrived at the house I was working on, I realized I had received only one of the two gallons of BN-101 paint I had ordered. I called the store immediately, and the manager arranged for me to pick up the missing gallon of paint at the location closest to where I was working. Also, he gave me my money back for both gallons. I will definitely use this service again!    \n" +
                "\n" +
                "Jesse Beeby Mr.Beeby,\n" +
                "\n" +
                "We are glad to have served your business recently. We saw the comments you posted about us on uopine.com, and we are grateful to you. It was nice to hear that our flagship location was so convenient to your work site and that you were able to pick up your missing paint there.\n" +
                "\n" +
                "We stand behind our products and services and look forward to seeing you again soon. After all, the rainy season is almost here, so now is a great time to come in and get the tools you need for those upcoming roof jobs!\n" +
                "\n" +
                "Hattie Jones\n" +
                "Customer Service Manager\n" +
                "Bright Now Home",
                "30. What is one purpose of Ms. Jones's e-mail?","To introduce a new service","To thank a customer","To announce a seasonal sale","To explain a policy change","","B", new BaiThiThu("Test 01",1)));


        dsDocHieu.add(new Part7("Piper McNair (12:15 P.M.) \n" +
                "Hi Marcus and Cara. How are your jobs coming along? \n" +
                "Marcus Davison (12:17 P.M.)\n" +
                "The trees have been cut down, and the limbs and trunks are being loaded into the truck. I'm just about done here at the Jones property. \n" +
                "Piper McNair (12:18 P.M.) I just got a call from a new client, Ms. Mirzoyan. She said a tree in her yard has come down and she needs it removed right away. A real estate agent is stopping by her house tomorrow morning with some prospective buyers. \n" +
                "Cara Brooks (12:19 P.M.) I should be done at the Smith property in about an hour. What is Ms. Mirzoyan's address? \n" +
                "Piper McNair (12:19 P.M.) 234 Lakeside Avenue. I'll tell her you can be there in a couple of hours. \n" +
                "Cara Brooks (12:20 P.M.) That works for me. \n" +
                "Piper McNair (12:20 P.M.) It will probably be a three-hour job. Given the size of the tree, you'll need an extra pair of hands, so I've called \n" +
                "Grady Marcus Davison (12:21 P.M.) It's Saturday \n" +
                "Piper McNair (12:22 P.M.) I understand, but with Miles out sick for the last four days, I had no choice \n" +
                "Marcus Davison (12:22 P.M.) I'm glad he agreed to help out on his day off. We've had more work this spring than usual. Does he need a ride? \n" +
                "Piper McNair (12:23 P.M.) No. Just let him know when you've reached the Mirzoyan residence. I'll tell Ms. Mirzoyan to expect all three of you this afternoon.\n",
                "22 Where do the writers most likely work?","At a tree service company","At a real estate agency","At a construction firm","At an auto repair shop","","A", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Piper McNair (12:15 P.M.) \n" +
                "Hi Marcus and Cara. How are your jobs coming along? \n" +
                "Marcus Davison (12:17 P.M.)\n" +
                "The trees have been cut down, and the limbs and trunks are being loaded into the truck. I'm just about done here at the Jones property. \n" +
                "Piper McNair (12:18 P.M.) I just got a call from a new client, Ms. Mirzoyan. She said a tree in her yard has come down and she needs it removed right away. A real estate agent is stopping by her house tomorrow morning with some prospective buyers. \n" +
                "Cara Brooks (12:19 P.M.) I should be done at the Smith property in about an hour. What is Ms. Mirzoyan's address? \n" +
                "Piper McNair (12:19 P.M.) 234 Lakeside Avenue. I'll tell her you can be there in a couple of hours. \n" +
                "Cara Brooks (12:20 P.M.) That works for me. \n" +
                "Piper McNair (12:20 P.M.) It will probably be a three-hour job. Given the size of the tree, you'll need an extra pair of hands, so I've called \n" +
                "Grady Marcus Davison (12:21 P.M.) It's Saturday \n" +
                "Piper McNair (12:22 P.M.) I understand, but with Miles out sick for the last four days, I had no choice \n" +
                "Marcus Davison (12:22 P.M.) I'm glad he agreed to help out on his day off. We've had more work this spring than usual. Does he need a ride? \n" +
                "Piper McNair (12:23 P.M.) No. Just let him know when you've reached the Mirzoyan residence. I'll tell Ms. Mirzoyan to expect all three of you this afternoon.\n",
                "23 What does Ms. Mirzoyan expect to do tomorrow?","Purchase a property","Have visitors at her home","Hire a new moving company","Use Ms. McNair's business again","","B", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Piper McNair (12:15 P.M.) \n" +
                "Hi Marcus and Cara. How are your jobs coming along? \n" +
                "Marcus Davison (12:17 P.M.)\n" +
                "The trees have been cut down, and the limbs and trunks are being loaded into the truck. I'm just about done here at the Jones property. \n" +
                "Piper McNair (12:18 P.M.) I just got a call from a new client, Ms. Mirzoyan. She said a tree in her yard has come down and she needs it removed right away. A real estate agent is stopping by her house tomorrow morning with some prospective buyers. \n" +
                "Cara Brooks (12:19 P.M.) I should be done at the Smith property in about an hour. What is Ms. Mirzoyan's address? \n" +
                "Piper McNair (12:19 P.M.) 234 Lakeside Avenue. I'll tell her you can be there in a couple of hours. \n" +
                "Cara Brooks (12:20 P.M.) That works for me. \n" +
                "Piper McNair (12:20 P.M.) It will probably be a three-hour job. Given the size of the tree, you'll need an extra pair of hands, so I've called \n" +
                "Grady Marcus Davison (12:21 P.M.) It's Saturday \n" +
                "Piper McNair (12:22 P.M.) I understand, but with Miles out sick for the last four days, I had no choice \n" +
                "Marcus Davison (12:22 P.M.) I'm glad he agreed to help out on his day off. We've had more work this spring than usual. Does he need a ride? \n" +
                "Piper McNair (12:23 P.M.) No. Just let him know when you've reached the Mirzoyan residence. I'll tell Ms. Mirzoyan to expect all three of you this afternoon.\n",
                "24 When will the writers most likely meet at 234 Lakeside Avenue?","In one hour","In two hours","In three hours","In four hours","","B", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Piper McNair (12:15 P.M.) \n" +
                "Hi Marcus and Cara. How are your jobs coming along? \n" +
                "Marcus Davison (12:17 P.M.)\n" +
                "The trees have been cut down, and the limbs and trunks are being loaded into the truck. I'm just about done here at the Jones property. \n" +
                "Piper McNair (12:18 P.M.) I just got a call from a new client, Ms. Mirzoyan. She said a tree in her yard has come down and she needs it removed right away. A real estate agent is stopping by her house tomorrow morning with some prospective buyers. \n" +
                "Cara Brooks (12:19 P.M.) I should be done at the Smith property in about an hour. What is Ms. Mirzoyan's address? \n" +
                "Piper McNair (12:19 P.M.) 234 Lakeside Avenue. I'll tell her you can be there in a couple of hours. \n" +
                "Cara Brooks (12:20 P.M.) That works for me. \n" +
                "Piper McNair (12:20 P.M.) It will probably be a three-hour job. Given the size of the tree, you'll need an extra pair of hands, so I've called \n" +
                "Grady Marcus Davison (12:21 P.M.) It's Saturday \n" +
                "Piper McNair (12:22 P.M.) I understand, but with Miles out sick for the last four days, I had no choice \n" +
                "Marcus Davison (12:22 P.M.) I'm glad he agreed to help out on his day off. We've had more work this spring than usual. Does he need a ride? \n" +
                "Piper McNair (12:23 P.M.) No. Just let him know when you've reached the Mirzoyan residence. I'll tell Ms. Mirzoyan to expect all three of you this afternoon.\n",
                "25 At 12:21 PM, what does Mr. Davison most likely mean when writes, 'It's Saturday?'","He does not have extra time","He thinks they should not accept more work","Grady is not usually available then","Miles did not make a good decision","","C", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Mission Statement\n" +
                "The Hulani Harbor Neighborhood Association (HHNA) is a self-governing organization that strives to promote a safe, vibrant, and enjoyable community for all. Members live in the Hulani Harbor area and are committed to the following goals: \n" +
                "1. Ensuring that the Hulani Harbor area maintains a range of housing types\n" +
                "and price levels \n" +
                "2. Preserving the architectural character of historic homes \n" +
                "3. Planning seasonal gatherings and events for residents \n" +
                "4. Promoting open discussion of local issues and initiatives\n" +
                "The Hulani Harbor Neighborhood Association Quarterly Meeting \n" +
                "Scheduled for Thursday, April 20, at 7:00 P.M. \n" +
                "New topics added to the meeting agenda: \n" +
                "• The Chenaux Company seeks rezoning for 3912 Bennett Avenue, a residential structure built in 1909. The company is requesting that the property be approved for commercial use, after which the house would be completely remodeled. We invite residents to attend the city council meeting on Monday, April 17, to learn more about the company's request and then be prepared to discuss further at the HHNA meeting on Thursday evening. \n" +
                "•The leadership committee for the Brazoria Creek sector announces a position opening. Duties include serving as point of contact for residents, distributing the monthly newsletter, and sharing information with other leaders of the HHNA. Individuals who are interested in representing Brazoria Creek will each be asked to speak briefly before a vote will take place.\n",
                "26 What does the HHNA indicate in the mission statement?","It is an independently run group","It was formed recently","It is advised by city officials","It charges membership frees","","A", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Mission Statement\n" +
                "The Hulani Harbor Neighborhood Association (HHNA) is a self-governing organization that strives to promote a safe, vibrant, and enjoyable community for all. Members live in the Hulani Harbor area and are committed to the following goals: \n" +
                "1. Ensuring that the Hulani Harbor area maintains a range of housing types\n" +
                "and price levels \n" +
                "2. Preserving the architectural character of historic homes \n" +
                "3. Planning seasonal gatherings and events for residents \n" +
                "4. Promoting open discussion of local issues and initiatives\n" +
                "The Hulani Harbor Neighborhood Association Quarterly Meeting \n" +
                "Scheduled for Thursday, April 20, at 7:00 P.M. \n" +
                "New topics added to the meeting agenda: \n" +
                "• The Chenaux Company seeks rezoning for 3912 Bennett Avenue, a residential structure built in 1909. The company is requesting that the property be approved for commercial use, after which the house would be completely remodeled. We invite residents to attend the city council meeting on Monday, April 17, to learn more about the company's request and then be prepared to discuss further at the HHNA meeting on Thursday evening. \n" +
                "•The leadership committee for the Brazoria Creek sector announces a position opening. Duties include serving as point of contact for residents, distributing the monthly newsletter, and sharing information with other leaders of the HHNA. Individuals who are interested in representing Brazoria Creek will each be asked to speak briefly before a vote will take place.\n",
                "27 Why are residents encouraged to attend a meeting on Monday, April 17?","To receive training in public speaking","To show support for some city politicians","To get information about a zoning proposal","To meet some new neighbors","","C", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Mission Statement\n" +
                "The Hulani Harbor Neighborhood Association (HHNA) is a self-governing organization that strives to promote a safe, vibrant, and enjoyable community for all. Members live in the Hulani Harbor area and are committed to the following goals: \n" +
                "1. Ensuring that the Hulani Harbor area maintains a range of housing types\n" +
                "and price levels \n" +
                "2. Preserving the architectural character of historic homes \n" +
                "3. Planning seasonal gatherings and events for residents \n" +
                "4. Promoting open discussion of local issues and initiatives\n" +
                "The Hulani Harbor Neighborhood Association Quarterly Meeting \n" +
                "Scheduled for Thursday, April 20, at 7:00 P.M. \n" +
                "New topics added to the meeting agenda: \n" +
                "• The Chenaux Company seeks rezoning for 3912 Bennett Avenue, a residential structure built in 1909. The company is requesting that the property be approved for commercial use, after which the house would be completely remodeled. We invite residents to attend the city council meeting on Monday, April 17, to learn more about the company's request and then be prepared to discuss further at the HHNA meeting on Thursday evening. \n" +
                "•The leadership committee for the Brazoria Creek sector announces a position opening. Duties include serving as point of contact for residents, distributing the monthly newsletter, and sharing information with other leaders of the HHNA. Individuals who are interested in representing Brazoria Creek will each be asked to speak briefly before a vote will take place.\n",
                "28 What HHNA goal is most likely being challenged by the Chenaux Company?","Goal 1","Goal 2","Goal 3","Goal 4","","B", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Mission Statement\n" +
                "The Hulani Harbor Neighborhood Association (HHNA) is a self-governing organization that strives to promote a safe, vibrant, and enjoyable community for all. Members live in the Hulani Harbor area and are committed to the following goals: \n" +
                "1. Ensuring that the Hulani Harbor area maintains a range of housing types\n" +
                "and price levels \n" +
                "2. Preserving the architectural character of historic homes \n" +
                "3. Planning seasonal gatherings and events for residents \n" +
                "4. Promoting open discussion of local issues and initiatives\n" +
                "The Hulani Harbor Neighborhood Association Quarterly Meeting \n" +
                "Scheduled for Thursday, April 20, at 7:00 P.M. \n" +
                "New topics added to the meeting agenda: \n" +
                "• The Chenaux Company seeks rezoning for 3912 Bennett Avenue, a residential structure built in 1909. The company is requesting that the property be approved for commercial use, after which the house would be completely remodeled. We invite residents to attend the city council meeting on Monday, April 17, to learn more about the company's request and then be prepared to discuss further at the HHNA meeting on Thursday evening. \n" +
                "•The leadership committee for the Brazoria Creek sector announces a position opening. Duties include serving as point of contact for residents, distributing the monthly newsletter, and sharing information with other leaders of the HHNA. Individuals who are interested in representing Brazoria Creek will each be asked to speak briefly before a vote will take place.\n",
                "29 What is suggested about Ms. Redman?","She spoke at a meeting in April","She owned a business in Hulani Harbor","She is responsible for distributing the meeting agendas","She writes articles for a newsletter","","A", new BaiThiThu("Test 02",2)));
        dsDocHieu.add(new Part7("Mission Statement\n" +
                "The Hulani Harbor Neighborhood Association (HHNA) is a self-governing organization that strives to promote a safe, vibrant, and enjoyable community for all. Members live in the Hulani Harbor area and are committed to the following goals: \n" +
                "1. Ensuring that the Hulani Harbor area maintains a range of housing types\n" +
                "and price levels \n" +
                "2. Preserving the architectural character of historic homes \n" +
                "3. Planning seasonal gatherings and events for residents \n" +
                "4. Promoting open discussion of local issues and initiatives\n" +
                "The Hulani Harbor Neighborhood Association Quarterly Meeting \n" +
                "Scheduled for Thursday, April 20, at 7:00 P.M. \n" +
                "New topics added to the meeting agenda: \n" +
                "• The Chenaux Company seeks rezoning for 3912 Bennett Avenue, a residential structure built in 1909. The company is requesting that the property be approved for commercial use, after which the house would be completely remodeled. We invite residents to attend the city council meeting on Monday, April 17, to learn more about the company's request and then be prepared to discuss further at the HHNA meeting on Thursday evening. \n" +
                "•The leadership committee for the Brazoria Creek sector announces a position opening. Duties include serving as point of contact for residents, distributing the monthly newsletter, and sharing information with other leaders of the HHNA. Individuals who are interested in representing Brazoria Creek will each be asked to speak briefly before a vote will take place.\n",
                "30 What does Ms. Redman suggest qualifies her for the representative position?","Her university degree","Her fresh leadership ideas","Her awareness of national issues","Her experience in supporting local groups","","D", new BaiThiThu("Test 02",2)));


        dsDocHieu.add(new Part7("Quester Expands Marketplace\n" +
                "DUBLIN (23 July) Quester Ltd., the company that operates the groundbreaking Quester Web site for job seekers and employers, has announced that it will now include technology-related occupations in its marketplace Since its launch more than five years ago Quester has focused solely on staffing for organisations in the health-care sector. Like health care, the technology sector is also struggling to find employees who have the right skills and who can help meet the demands created by high growth. \"The employment rate of technology professionals is already quite high, yet jobs in the industry are projected to grow significantly each year over the next decade,\" said Ladli Misra, a founding partner of Quester. Quester works by bringing job seekers together with recruiters and hiring managers. When companies contract with Quester, job listings are created with details of the companies' open positions. Job seekers create a skill-set profile and identify opportunities of interest to them. Candidates and employers interact, seeking links and bridges between skills and jobs listed on the Quester site. Quester's proprietary algorithm matches employers and job seekers and then notifies both. Using a simple messagingand-scheduling tool, job seekers can indicate their interest in a job opening and employers can send interview requests. Employers are assigned a personal guide to walk them through the process and to ensure the maximum benefit from the experience. There is no cost to job seekers. \"It's great for both ends of the employment market,\" said Ms. Misra. \"Job seekers can easily find the most appropriate opportunities and employers get the information they need to efficiently acquire in-demand talent, usually in less than a month.\"\n" +
                "\n",
                "22 Where would the article most likely appear?","In a medical journal","In a business magazine","In a technology firm's newsletter","On a hospital's Web site","","B", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Quester Expands Marketplace\n" +
                "DUBLIN (23 July) Quester Ltd., the company that operates the groundbreaking Quester Web site for job seekers and employers, has announced that it will now include technology-related occupations in its marketplace Since its launch more than five years ago Quester has focused solely on staffing for organisations in the health-care sector. Like health care, the technology sector is also struggling to find employees who have the right skills and who can help meet the demands created by high growth. \"The employment rate of technology professionals is already quite high, yet jobs in the industry are projected to grow significantly each year over the next decade,\" said Ladli Misra, a founding partner of Quester. Quester works by bringing job seekers together with recruiters and hiring managers. When companies contract with Quester, job listings are created with details of the companies' open positions. Job seekers create a skill-set profile and identify opportunities of interest to them. Candidates and employers interact, seeking links and bridges between skills and jobs listed on the Quester site. Quester's proprietary algorithm matches employers and job seekers and then notifies both. Using a simple messagingand-scheduling tool, job seekers can indicate their interest in a job opening and employers can send interview requests. Employers are assigned a personal guide to walk them through the process and to ensure the maximum benefit from the experience. There is no cost to job seekers. \"It's great for both ends of the employment market,\" said Ms. Misra. \"Job seekers can easily find the most appropriate opportunities and employers get the information they need to efficiently acquire in-demand talent, usually in less than a month.\"\n" +
                "\n",
                "23 The word 'meet' in paragraph 2, line 7, is closest in meaning do","fulfill","join","find","contact","","A", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Quester Expands Marketplace\n" +
                "DUBLIN (23 July) Quester Ltd., the company that operates the groundbreaking Quester Web site for job seekers and employers, has announced that it will now include technology-related occupations in its marketplace Since its launch more than five years ago Quester has focused solely on staffing for organisations in the health-care sector. Like health care, the technology sector is also struggling to find employees who have the right skills and who can help meet the demands created by high growth. \"The employment rate of technology professionals is already quite high, yet jobs in the industry are projected to grow significantly each year over the next decade,\" said Ladli Misra, a founding partner of Quester. Quester works by bringing job seekers together with recruiters and hiring managers. When companies contract with Quester, job listings are created with details of the companies' open positions. Job seekers create a skill-set profile and identify opportunities of interest to them. Candidates and employers interact, seeking links and bridges between skills and jobs listed on the Quester site. Quester's proprietary algorithm matches employers and job seekers and then notifies both. Using a simple messagingand-scheduling tool, job seekers can indicate their interest in a job opening and employers can send interview requests. Employers are assigned a personal guide to walk them through the process and to ensure the maximum benefit from the experience. There is no cost to job seekers. \"It's great for both ends of the employment market,\" said Ms. Misra. \"Job seekers can easily find the most appropriate opportunities and employers get the information they need to efficiently acquire in-demand talent, usually in less than a month.\"\n" +
                "\n",
                "24 What is indicated about Ms. Misra?","She worked as a medical professional in the past","She helped to create Quester","She is in charge of hiring at Quester","She expects the health-care sector's profits to grow","","B", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Quester Expands Marketplace\n" +
                "DUBLIN (23 July) Quester Ltd., the company that operates the groundbreaking Quester Web site for job seekers and employers, has announced that it will now include technology-related occupations in its marketplace Since its launch more than five years ago Quester has focused solely on staffing for organisations in the health-care sector. Like health care, the technology sector is also struggling to find employees who have the right skills and who can help meet the demands created by high growth. \"The employment rate of technology professionals is already quite high, yet jobs in the industry are projected to grow significantly each year over the next decade,\" said Ladli Misra, a founding partner of Quester. Quester works by bringing job seekers together with recruiters and hiring managers. When companies contract with Quester, job listings are created with details of the companies' open positions. Job seekers create a skill-set profile and identify opportunities of interest to them. Candidates and employers interact, seeking links and bridges between skills and jobs listed on the Quester site. Quester's proprietary algorithm matches employers and job seekers and then notifies both. Using a simple messagingand-scheduling tool, job seekers can indicate their interest in a job opening and employers can send interview requests. Employers are assigned a personal guide to walk them through the process and to ensure the maximum benefit from the experience. There is no cost to job seekers. \"It's great for both ends of the employment market,\" said Ms. Misra. \"Job seekers can easily find the most appropriate opportunities and employers get the information they need to efficiently acquire in-demand talent, usually in less than a month.\"\n" +
                "\n",
                "25 What is suggested about Quester's system?","Its technology needs to be upgraded","It guarantees job seekers a match within 30 days","It offers positions in many different industries","Its costs are covered by employers","","D", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Greenfell Landscaping\n" +
                "Make sure your company's natural features look their best. A tidy first impression is important. Greenfell Landscaping can help you keep your company's greenery green! We have multiple tiers of service designed especially for our commercial clients. \n" +
                "- Eco Keeper Standard: weekly lawn mowing with detailed grass trimming by walkways and buildings \n" +
                "- Eco Keeper Plus: weekly mowing and trimming, organic fertilizer application, and weed removal. Our most popular service. \n" +
                "- Master Green Gold: all the lawn-care services of our Eco Keeper Plus plan with the added benefit of seasonal flower plantings and flower bed maintenance \n" +
                "- Master Green Platinum: all the services of our Master Green Gold plan but with care for your small trees and shrubs included. Twice-yearly pruning and trimming. Insect control. We can even bring ornamental potted trees to brighten your entryways. \n" +
                "Contact service@greenfell.com to request an estimate. Costs are based on plan, lawn size, and type of plantings\n" +
                "Hello,\n" +
                "My company has recently decided to outsource the lawn care at both our work sites, and I have been asked to solicit bids for a contract to do the work. I saw your Greenfell Landscaping flyer and wanted to reach out to you, as we would prefer to work with a locally owned company rather than a large franchise.\n" +
                "We have two properties with large lawns. Our main offices are on Langley Boulevard, near the Crossroads Shopping Plaza, and our shipping warehouse is five kilometers from the main offices, on Kempton Road. Our needs are fairly simple. We only require that the grass be kept short for a low but fair cost. We do not have any flower gardens or hedges, so the mowing is very straightforward.\n" +
                "If you are interested in submitting a bid, please let me know.\n" +
                "Daphne Mizuno, Facilities Manager Pamaturn Products, LLC",
                "26 For whom is the flyer specifically intended?","Private homeowners","Part-time landscapers","Business owners","Environmental researchers","","C", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Greenfell Landscaping\n" +
                "Make sure your company's natural features look their best. A tidy first impression is important. Greenfell Landscaping can help you keep your company's greenery green! We have multiple tiers of service designed especially for our commercial clients. \n" +
                "- Eco Keeper Standard: weekly lawn mowing with detailed grass trimming by walkways and buildings \n" +
                "- Eco Keeper Plus: weekly mowing and trimming, organic fertilizer application, and weed removal. Our most popular service. \n" +
                "- Master Green Gold: all the lawn-care services of our Eco Keeper Plus plan with the added benefit of seasonal flower plantings and flower bed maintenance \n" +
                "- Master Green Platinum: all the services of our Master Green Gold plan but with care for your small trees and shrubs included. Twice-yearly pruning and trimming. Insect control. We can even bring ornamental potted trees to brighten your entryways. \n" +
                "Contact service@greenfell.com to request an estimate. Costs are based on plan, lawn size, and type of plantings\n" +
                "Hello,\n" +
                "My company has recently decided to outsource the lawn care at both our work sites, and I have been asked to solicit bids for a contract to do the work. I saw your Greenfell Landscaping flyer and wanted to reach out to you, as we would prefer to work with a locally owned company rather than a large franchise.\n" +
                "We have two properties with large lawns. Our main offices are on Langley Boulevard, near the Crossroads Shopping Plaza, and our shipping warehouse is five kilometers from the main offices, on Kempton Road. Our needs are fairly simple. We only require that the grass be kept short for a low but fair cost. We do not have any flower gardens or hedges, so the mowing is very straightforward.\n" +
                "If you are interested in submitting a bid, please let me know.\n" +
                "Daphne Mizuno, Facilities Manager Pamaturn Products, LLC",
                "27 Why did Ms. Mizuno contact Greenfell Landscaping in particular?","Because she saw a discount offer","Because it is a local company","Because she recently met the owner","Because it uses highly specialized equipment","","B", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Greenfell Landscaping\n" +
                "Make sure your company's natural features look their best. A tidy first impression is important. Greenfell Landscaping can help you keep your company's greenery green! We have multiple tiers of service designed especially for our commercial clients. \n" +
                "- Eco Keeper Standard: weekly lawn mowing with detailed grass trimming by walkways and buildings \n" +
                "- Eco Keeper Plus: weekly mowing and trimming, organic fertilizer application, and weed removal. Our most popular service. \n" +
                "- Master Green Gold: all the lawn-care services of our Eco Keeper Plus plan with the added benefit of seasonal flower plantings and flower bed maintenance \n" +
                "- Master Green Platinum: all the services of our Master Green Gold plan but with care for your small trees and shrubs included. Twice-yearly pruning and trimming. Insect control. We can even bring ornamental potted trees to brighten your entryways. \n" +
                "Contact service@greenfell.com to request an estimate. Costs are based on plan, lawn size, and type of plantings\n" +
                "Hello,\n" +
                "My company has recently decided to outsource the lawn care at both our work sites, and I have been asked to solicit bids for a contract to do the work. I saw your Greenfell Landscaping flyer and wanted to reach out to you, as we would prefer to work with a locally owned company rather than a large franchise.\n" +
                "We have two properties with large lawns. Our main offices are on Langley Boulevard, near the Crossroads Shopping Plaza, and our shipping warehouse is five kilometers from the main offices, on Kempton Road. Our needs are fairly simple. We only require that the grass be kept short for a low but fair cost. We do not have any flower gardens or hedges, so the mowing is very straightforward.\n" +
                "If you are interested in submitting a bid, please let me know.\n" +
                "Daphne Mizuno, Facilities Manager Pamaturn Products, LLC",
                "28 What level of service will Ms. Mizuno most likely choose?","Eco Keeper Standard","Eco Keeper Plus","Master Green Gold","Master Green Platinum","","A", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Greenfell Landscaping\n" +
                "Make sure your company's natural features look their best. A tidy first impression is important. Greenfell Landscaping can help you keep your company's greenery green! We have multiple tiers of service designed especially for our commercial clients. \n" +
                "- Eco Keeper Standard: weekly lawn mowing with detailed grass trimming by walkways and buildings \n" +
                "- Eco Keeper Plus: weekly mowing and trimming, organic fertilizer application, and weed removal. Our most popular service. \n" +
                "- Master Green Gold: all the lawn-care services of our Eco Keeper Plus plan with the added benefit of seasonal flower plantings and flower bed maintenance \n" +
                "- Master Green Platinum: all the services of our Master Green Gold plan but with care for your small trees and shrubs included. Twice-yearly pruning and trimming. Insect control. We can even bring ornamental potted trees to brighten your entryways. \n" +
                "Contact service@greenfell.com to request an estimate. Costs are based on plan, lawn size, and type of plantings\n" +
                "Hello,\n" +
                "My company has recently decided to outsource the lawn care at both our work sites, and I have been asked to solicit bids for a contract to do the work. I saw your Greenfell Landscaping flyer and wanted to reach out to you, as we would prefer to work with a locally owned company rather than a large franchise.\n" +
                "We have two properties with large lawns. Our main offices are on Langley Boulevard, near the Crossroads Shopping Plaza, and our shipping warehouse is five kilometers from the main offices, on Kempton Road. Our needs are fairly simple. We only require that the grass be kept short for a low but fair cost. We do not have any flower gardens or hedges, so the mowing is very straightforward.\n" +
                "If you are interested in submitting a bid, please let me know.\n" +
                "Daphne Mizuno, Facilities Manager Pamaturn Products, LLC",
                "29 Acrrording to the second e-mail, what should Ms. Mizuno do?","Submit a competitive bid","Provide the name of a reference","Arrange a meeting with Mr. Karpyak","Send Mr. Karpyak the details of a job","","D", new BaiThiThu("Test 03",3)));
        dsDocHieu.add(new Part7("Greenfell Landscaping\n" +
                "Make sure your company's natural features look their best. A tidy first impression is important. Greenfell Landscaping can help you keep your company's greenery green! We have multiple tiers of service designed especially for our commercial clients. \n" +
                "- Eco Keeper Standard: weekly lawn mowing with detailed grass trimming by walkways and buildings \n" +
                "- Eco Keeper Plus: weekly mowing and trimming, organic fertilizer application, and weed removal. Our most popular service. \n" +
                "- Master Green Gold: all the lawn-care services of our Eco Keeper Plus plan with the added benefit of seasonal flower plantings and flower bed maintenance \n" +
                "- Master Green Platinum: all the services of our Master Green Gold plan but with care for your small trees and shrubs included. Twice-yearly pruning and trimming. Insect control. We can even bring ornamental potted trees to brighten your entryways. \n" +
                "Contact service@greenfell.com to request an estimate. Costs are based on plan, lawn size, and type of plantings\n" +
                "Hello,\n" +
                "My company has recently decided to outsource the lawn care at both our work sites, and I have been asked to solicit bids for a contract to do the work. I saw your Greenfell Landscaping flyer and wanted to reach out to you, as we would prefer to work with a locally owned company rather than a large franchise.\n" +
                "We have two properties with large lawns. Our main offices are on Langley Boulevard, near the Crossroads Shopping Plaza, and our shipping warehouse is five kilometers from the main offices, on Kempton Road. Our needs are fairly simple. We only require that the grass be kept short for a low but fair cost. We do not have any flower gardens or hedges, so the mowing is very straightforward.\n" +
                "If you are interested in submitting a bid, please let me know.\n" +
                "Daphne Mizuno, Facilities Manager Pamaturn Products, LLC",
                "30 What is most likely true about Mr. Stolz?","He used to work for Pamaturm Products","His insurance payments are up-to-date","He lives near the Crossroads Shopping Plaza","His shop is located on Kempton Road","","D", new BaiThiThu("Test 03",3)));

        dsDocHieu.add(new Part7("AFEC Offers Pathway to Success shield emerging entrepreneurs from the challenges I faced early on in my career. By Pauline Weston Because I lacked adequate advice when I BRIDGETOWN (29 October) From 14 to started my business, I made some mistakes 16 November, the Association of Female that nearly ruined it.\" Entrepreneurs of the Caribbean (AFEC) will Attendees are keen on engaging with be hosting its fourth biennial forum at the their established peers. Madelon Picard, a Centre for Labour Force Development in native of Martinique who plans to open a Bridgetown, Barbados. This year's theme, nursery school on the island, says, \"I am \"From Aspiration to Sensation,\" is centered eager to learn how my role models dealt with on the essential skills and tools needed to challenges and accomplished their start, run, and grow a successful business. achievements. -141 Ms. Picard also — [1] - About 350 women will be referenced the assistance she has received interacting with some of the region's most from the Martinique Business Society (MBS), of which she is a member. \"The a series of presentations. ---121 -\n" +
                "MBS is fully funding my participation in the One presenter will be Serena Telting. AFEC forum, from hotel accommodation owner of Suriname-based children's clothing and airfare to meals and local transport.\" She manufacturer Serenatee. She welcomes the is far from the exception. Organisers say opportunity to share her experience with they have seen a significant increase ir conference goers. — [3] — \"Specifically,\" financial support for attendees since the first she says, \"I will be promoting a set of sound AFEC forum. practices that I have adopted over my fifteen years in the apparel industry. Those might\n",
                "22 Why was the article written?","To discuss some of the challenges female entrepreneurs face","To highlight the need for more role models in business","To show the importantce of business in the Caribbean","To publicize an upcoming business gathering","","D", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("AFEC Offers Pathway to Success shield emerging entrepreneurs from the challenges I faced early on in my career. By Pauline Weston Because I lacked adequate advice when I BRIDGETOWN (29 October) From 14 to started my business, I made some mistakes 16 November, the Association of Female that nearly ruined it.\" Entrepreneurs of the Caribbean (AFEC) will Attendees are keen on engaging with be hosting its fourth biennial forum at the their established peers. Madelon Picard, a Centre for Labour Force Development in native of Martinique who plans to open a Bridgetown, Barbados. This year's theme, nursery school on the island, says, \"I am \"From Aspiration to Sensation,\" is centered eager to learn how my role models dealt with on the essential skills and tools needed to challenges and accomplished their start, run, and grow a successful business. achievements. -141 Ms. Picard also — [1] - About 350 women will be referenced the assistance she has received interacting with some of the region's most from the Martinique Business Society (MBS), of which she is a member. \"The a series of presentations. ---121 -\n" +
                "MBS is fully funding my participation in the One presenter will be Serena Telting. AFEC forum, from hotel accommodation owner of Suriname-based children's clothing and airfare to meals and local transport.\" She manufacturer Serenatee. She welcomes the is far from the exception. Organisers say opportunity to share her experience with they have seen a significant increase ir conference goers. — [3] — \"Specifically,\" financial support for attendees since the first she says, \"I will be promoting a set of sound AFEC forum. practices that I have adopted over my fifteen years in the apparel industry. Those might\n",
                "23 What is suggested about Ms. Telting?","She had a difficult start to her career","She attended the first AFEC forum","She distributes her products across the Caribbean","She has been promoting good business practices for fifteen years","","A", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("AFEC Offers Pathway to Success shield emerging entrepreneurs from the challenges I faced early on in my career. By Pauline Weston Because I lacked adequate advice when I BRIDGETOWN (29 October) From 14 to started my business, I made some mistakes 16 November, the Association of Female that nearly ruined it.\" Entrepreneurs of the Caribbean (AFEC) will Attendees are keen on engaging with be hosting its fourth biennial forum at the their established peers. Madelon Picard, a Centre for Labour Force Development in native of Martinique who plans to open a Bridgetown, Barbados. This year's theme, nursery school on the island, says, \"I am \"From Aspiration to Sensation,\" is centered eager to learn how my role models dealt with on the essential skills and tools needed to challenges and accomplished their start, run, and grow a successful business. achievements. -141 Ms. Picard also — [1] - About 350 women will be referenced the assistance she has received interacting with some of the region's most from the Martinique Business Society (MBS), of which she is a member. \"The a series of presentations. ---121 -\n" +
                "MBS is fully funding my participation in the One presenter will be Serena Telting. AFEC forum, from hotel accommodation owner of Suriname-based children's clothing and airfare to meals and local transport.\" She manufacturer Serenatee. She welcomes the is far from the exception. Organisers say opportunity to share her experience with they have seen a significant increase ir conference goers. — [3] — \"Specifically,\" financial support for attendees since the first she says, \"I will be promoting a set of sound AFEC forum. practices that I have adopted over my fifteen years in the apparel industry. Those might\n",
                "24 What is NOT true about Ms. Picard?","She received sponsorship from a trade organization","She wants to start an edicational institution","She is looking forward to the AFEC forum","She is one of the organizers of the event","","D", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("AFEC Offers Pathway to Success shield emerging entrepreneurs from the challenges I faced early on in my career. By Pauline Weston Because I lacked adequate advice when I BRIDGETOWN (29 October) From 14 to started my business, I made some mistakes 16 November, the Association of Female that nearly ruined it.\" Entrepreneurs of the Caribbean (AFEC) will Attendees are keen on engaging with be hosting its fourth biennial forum at the their established peers. Madelon Picard, a Centre for Labour Force Development in native of Martinique who plans to open a Bridgetown, Barbados. This year's theme, nursery school on the island, says, \"I am \"From Aspiration to Sensation,\" is centered eager to learn how my role models dealt with on the essential skills and tools needed to challenges and accomplished their start, run, and grow a successful business. achievements. -141 Ms. Picard also — [1] - About 350 women will be referenced the assistance she has received interacting with some of the region's most from the Martinique Business Society (MBS), of which she is a member. \"The a series of presentations. ---121 -\n" +
                "MBS is fully funding my participation in the One presenter will be Serena Telting. AFEC forum, from hotel accommodation owner of Suriname-based children's clothing and airfare to meals and local transport.\" She manufacturer Serenatee. She welcomes the is far from the exception. Organisers say opportunity to share her experience with they have seen a significant increase ir conference goers. — [3] — \"Specifically,\" financial support for attendees since the first she says, \"I will be promoting a set of sound AFEC forum. practices that I have adopted over my fifteen years in the apparel industry. Those might\n",
                "25 In which of the positions marked [1], [2], [3], [4] does the following sentence best belong? 'They will also have the opportunity to attend one-on-one career coaching sessions'","[1]","[2]","[3]","[4]","","B", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("CLAREGAL TOURS\n" +
                "Claregal Tours has been showing visitors Western Ireland's most iconic sights for the past nneen years. Our buses are comfortable, air-conditioned, and include Wi-Fi. Our experienced drivers and guides are well versed in Ireland's history and culture. All excursions are day-long tours and leave from the bus terminal in Galway, \n" +
                "Aran Islands (AR1423) Spend the day island hopping between these three beautiful islands where you will see ancient ruins, visit a local farm, and have a chance to explore by bicycle. Ferry transportation fees included. Adult: €30. University Student: €25. Child: €20 \n" +
                "Aran Islands and Cliffs of Moher (AIM523) Take your time exploring one of the scenic Aran Islands, Inisheer, and then take a ferry to get up close to the Cliffs of Moher. Ferry transportation fees included. Adult: €40, University Student: €35, Child: €30 \n" +
                "Connemara (CON234) See the beautiful national park of Connemara, where nature is at its finest. Choose from several hiking options with varying degrees of difficulty. Adult: €35. University Student: €30. Child: €25 \n" +
                "Galway (GAL324) Get off the bus and into the city with this walking tour of Galway. Along the way, you will have the chance to hear traditional music, visit a pub, and see an Irish step dancing performance. Adult: €20, University Student: €18, Child: €15\n" +
                "Hi Alan and Siobhan,\n" +
                "I have attached the final list of passengers for tomorrow's tour with its itinerary. Alan will be the driver/guide, and Siobhan will be doing passenger check-in. The clients have requested that you drive them to a café to get breakfast before going to Inisheer, which is different from our usual itinerary, but I agreed. It should take one hour. Just a reminder that last month we changed the departure time from 9:30 AM to 9:15 A.M. Alan, when you are finished with the tour today, please come by my office. I would like to set your schedule for August.\n" +
                "See you tomorrow,\n" +
                "Helen Doyle Tour Manager, Claregal Tours",
                "26 What is true about Claregal Tours?","It specializes in hiking excursions","It has tours in multiple countries","Its prices change every year","It has been in operation for fifteen years","","D", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("CLAREGAL TOURS\n" +
                "Claregal Tours has been showing visitors Western Ireland's most iconic sights for the past nneen years. Our buses are comfortable, air-conditioned, and include Wi-Fi. Our experienced drivers and guides are well versed in Ireland's history and culture. All excursions are day-long tours and leave from the bus terminal in Galway, \n" +
                "Aran Islands (AR1423) Spend the day island hopping between these three beautiful islands where you will see ancient ruins, visit a local farm, and have a chance to explore by bicycle. Ferry transportation fees included. Adult: €30. University Student: €25. Child: €20 \n" +
                "Aran Islands and Cliffs of Moher (AIM523) Take your time exploring one of the scenic Aran Islands, Inisheer, and then take a ferry to get up close to the Cliffs of Moher. Ferry transportation fees included. Adult: €40, University Student: €35, Child: €30 \n" +
                "Connemara (CON234) See the beautiful national park of Connemara, where nature is at its finest. Choose from several hiking options with varying degrees of difficulty. Adult: €35. University Student: €30. Child: €25 \n" +
                "Galway (GAL324) Get off the bus and into the city with this walking tour of Galway. Along the way, you will have the chance to hear traditional music, visit a pub, and see an Irish step dancing performance. Adult: €20, University Student: €18, Child: €15\n" +
                "Hi Alan and Siobhan,\n" +
                "I have attached the final list of passengers for tomorrow's tour with its itinerary. Alan will be the driver/guide, and Siobhan will be doing passenger check-in. The clients have requested that you drive them to a café to get breakfast before going to Inisheer, which is different from our usual itinerary, but I agreed. It should take one hour. Just a reminder that last month we changed the departure time from 9:30 AM to 9:15 A.M. Alan, when you are finished with the tour today, please come by my office. I would like to set your schedule for August.\n" +
                "See you tomorrow,\n" +
                "Helen Doyle Tour Manager, Claregal Tours",
                "27 What do the tours have in common?","They include a ferry ride","They include visits to islands","They depart from the same location","They offer free lunch","","C", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("CLAREGAL TOURS\n" +
                "Claregal Tours has been showing visitors Western Ireland's most iconic sights for the past nneen years. Our buses are comfortable, air-conditioned, and include Wi-Fi. Our experienced drivers and guides are well versed in Ireland's history and culture. All excursions are day-long tours and leave from the bus terminal in Galway, \n" +
                "Aran Islands (AR1423) Spend the day island hopping between these three beautiful islands where you will see ancient ruins, visit a local farm, and have a chance to explore by bicycle. Ferry transportation fees included. Adult: €30. University Student: €25. Child: €20 \n" +
                "Aran Islands and Cliffs of Moher (AIM523) Take your time exploring one of the scenic Aran Islands, Inisheer, and then take a ferry to get up close to the Cliffs of Moher. Ferry transportation fees included. Adult: €40, University Student: €35, Child: €30 \n" +
                "Connemara (CON234) See the beautiful national park of Connemara, where nature is at its finest. Choose from several hiking options with varying degrees of difficulty. Adult: €35. University Student: €30. Child: €25 \n" +
                "Galway (GAL324) Get off the bus and into the city with this walking tour of Galway. Along the way, you will have the chance to hear traditional music, visit a pub, and see an Irish step dancing performance. Adult: €20, University Student: €18, Child: €15\n" +
                "Hi Alan and Siobhan,\n" +
                "I have attached the final list of passengers for tomorrow's tour with its itinerary. Alan will be the driver/guide, and Siobhan will be doing passenger check-in. The clients have requested that you drive them to a café to get breakfast before going to Inisheer, which is different from our usual itinerary, but I agreed. It should take one hour. Just a reminder that last month we changed the departure time from 9:30 AM to 9:15 A.M. Alan, when you are finished with the tour today, please come by my office. I would like to set your schedule for August.\n" +
                "See you tomorrow,\n" +
                "Helen Doyle Tour Manager, Claregal Tours",
                "28 What is the purpose of the first e-mail?","To provide information for an upcoming tour","To give Mr. Trippier his August schedule","To change an employee's assignment","To introduce a new employee","","A", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("CLAREGAL TOURS\n" +
                "Claregal Tours has been showing visitors Western Ireland's most iconic sights for the past nneen years. Our buses are comfortable, air-conditioned, and include Wi-Fi. Our experienced drivers and guides are well versed in Ireland's history and culture. All excursions are day-long tours and leave from the bus terminal in Galway, \n" +
                "Aran Islands (AR1423) Spend the day island hopping between these three beautiful islands where you will see ancient ruins, visit a local farm, and have a chance to explore by bicycle. Ferry transportation fees included. Adult: €30. University Student: €25. Child: €20 \n" +
                "Aran Islands and Cliffs of Moher (AIM523) Take your time exploring one of the scenic Aran Islands, Inisheer, and then take a ferry to get up close to the Cliffs of Moher. Ferry transportation fees included. Adult: €40, University Student: €35, Child: €30 \n" +
                "Connemara (CON234) See the beautiful national park of Connemara, where nature is at its finest. Choose from several hiking options with varying degrees of difficulty. Adult: €35. University Student: €30. Child: €25 \n" +
                "Galway (GAL324) Get off the bus and into the city with this walking tour of Galway. Along the way, you will have the chance to hear traditional music, visit a pub, and see an Irish step dancing performance. Adult: €20, University Student: €18, Child: €15\n" +
                "Hi Alan and Siobhan,\n" +
                "I have attached the final list of passengers for tomorrow's tour with its itinerary. Alan will be the driver/guide, and Siobhan will be doing passenger check-in. The clients have requested that you drive them to a café to get breakfast before going to Inisheer, which is different from our usual itinerary, but I agreed. It should take one hour. Just a reminder that last month we changed the departure time from 9:30 AM to 9:15 A.M. Alan, when you are finished with the tour today, please come by my office. I would like to set your schedule for August.\n" +
                "See you tomorrow,\n" +
                "Helen Doyle Tour Manager, Claregal Tours",
                "29 What tour will Mr. Trippier most likely lead on July 9?","ARI423","AIM523","CON234","GAL324","","B", new BaiThiThu("Test 04",4)));
        dsDocHieu.add(new Part7("CLAREGAL TOURS\n" +
                "Claregal Tours has been showing visitors Western Ireland's most iconic sights for the past nneen years. Our buses are comfortable, air-conditioned, and include Wi-Fi. Our experienced drivers and guides are well versed in Ireland's history and culture. All excursions are day-long tours and leave from the bus terminal in Galway, \n" +
                "Aran Islands (AR1423) Spend the day island hopping between these three beautiful islands where you will see ancient ruins, visit a local farm, and have a chance to explore by bicycle. Ferry transportation fees included. Adult: €30. University Student: €25. Child: €20 \n" +
                "Aran Islands and Cliffs of Moher (AIM523) Take your time exploring one of the scenic Aran Islands, Inisheer, and then take a ferry to get up close to the Cliffs of Moher. Ferry transportation fees included. Adult: €40, University Student: €35, Child: €30 \n" +
                "Connemara (CON234) See the beautiful national park of Connemara, where nature is at its finest. Choose from several hiking options with varying degrees of difficulty. Adult: €35. University Student: €30. Child: €25 \n" +
                "Galway (GAL324) Get off the bus and into the city with this walking tour of Galway. Along the way, you will have the chance to hear traditional music, visit a pub, and see an Irish step dancing performance. Adult: €20, University Student: €18, Child: €15\n" +
                "Hi Alan and Siobhan,\n" +
                "I have attached the final list of passengers for tomorrow's tour with its itinerary. Alan will be the driver/guide, and Siobhan will be doing passenger check-in. The clients have requested that you drive them to a café to get breakfast before going to Inisheer, which is different from our usual itinerary, but I agreed. It should take one hour. Just a reminder that last month we changed the departure time from 9:30 AM to 9:15 A.M. Alan, when you are finished with the tour today, please come by my office. I would like to set your schedule for August.\n" +
                "See you tomorrow,\n" +
                "Helen Doyle Tour Manager, Claregal Tours",
                "30 What is likely true about the guests on Mr. Sliti;s trip?","They requested Ms. Canney as their guide","They are all adults","They have already paid for the tour","They will receive a discount","","B", new BaiThiThu("Test 04",4)));
        

        dsDocHieu.add(new Part7("Jaya Pillay (9:04 A.M.)\n" +
                "Paul and Kristen—are you two going to the meeting this morning? I need\n" +
                "a favor because I’m running late.\n" +
                "\n" +
                "Paul Smythe (9:06 A.M.)\n" +
                "Lam, What do you need?\n" +
                "\n" +
                "Jaya Pillay (9:07 A.M.)\n" +
                "Could you say a few words about last weekend's film festival in Atlanta?\n" +
                "\n" +
                "Kristen Tervo (9:07 A.M.)\n" +
                "Wait, what time is the meeting?\n" +
                "\n" +
                "Jaya Pillay (9:08 A.M.)\n" +
                "10:30 A.M,\n" +
                "\n" +
                "Paul Smythe (9:08 A.M.)\n" +
                "Sure, What do you want me to say?\n" +
                "\n" +
                "Kristen Tervo (9:09 A.M.)\n" +
                "Oh tight. I won't be there today. I’m busy working on an issue for David\n" +
                "in Finance.\n" +
                "\n" +
                "Jaya Pillay (9:10 A.M.)\n" +
                "OK. Paul, just say something about how attendance was great, and the\n" +
                "team should feel proud of themselves for their hard work\n" +
                "\n" +
                "Paul Smythe (9:11 A.M.)\n" +
                "Sure. When you arrive, will you be saying anything about the expansion\n" +
                "into Florida next quarter?\n" +
                "\n" +
                "Jaya Pillay (9:12 A.M.)\n" +
                "Yes, but most of the meeting will be about developing strategies to sell\n" +
                "more tickets on opening weekends in our existing theaters.\n" +
                "\n" +
                "Kristen Tervo (9:14 A.M.)\n" +
                "That's good to know. I'm meeting with the vice president of development\n" +
                "tomorrow. I'l be sure to fill her in on what we've been doing,",
                "22 For what type of business do the writers most likely work?","A construction company","A financial services firm","A movie theater chain","A travel agency","","C", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Jaya Pillay (9:04 A.M.)\n" +
                "Paul and Kristen—are you two going to the meeting this morning? I need\n" +
                "a favor because I’m running late.\n" +
                "\n" +
                "Paul Smythe (9:06 A.M.)\n" +
                "Lam, What do you need?\n" +
                "\n" +
                "Jaya Pillay (9:07 A.M.)\n" +
                "Could you say a few words about last weekend's film festival in Atlanta?\n" +
                "\n" +
                "Kristen Tervo (9:07 A.M.)\n" +
                "Wait, what time is the meeting?\n" +
                "\n" +
                "Jaya Pillay (9:08 A.M.)\n" +
                "10:30 A.M,\n" +
                "\n" +
                "Paul Smythe (9:08 A.M.)\n" +
                "Sure, What do you want me to say?\n" +
                "\n" +
                "Kristen Tervo (9:09 A.M.)\n" +
                "Oh tight. I won't be there today. I’m busy working on an issue for David\n" +
                "in Finance.\n" +
                "\n" +
                "Jaya Pillay (9:10 A.M.)\n" +
                "OK. Paul, just say something about how attendance was great, and the\n" +
                "team should feel proud of themselves for their hard work\n" +
                "\n" +
                "Paul Smythe (9:11 A.M.)\n" +
                "Sure. When you arrive, will you be saying anything about the expansion\n" +
                "into Florida next quarter?\n" +
                "\n" +
                "Jaya Pillay (9:12 A.M.)\n" +
                "Yes, but most of the meeting will be about developing strategies to sell\n" +
                "more tickets on opening weekends in our existing theaters.\n" +
                "\n" +
                "Kristen Tervo (9:14 A.M.)\n" +
                "That's good to know. I'm meeting with the vice president of development\n" +
                "tomorrow. I'l be sure to fill her in on what we've been doing,",
                "23 At 9:09 AM, what does Ms. Tervo imply when she writes, \"Oh right\"?","She agrees that the festival was a success","She now remembers when a meeting will begin","She thinks that Mr. Smythe is the best person to speak","She is confirming that she will purchase some tickets","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Jaya Pillay (9:04 A.M.)\n" +
                "Paul and Kristen—are you two going to the meeting this morning? I need\n" +
                "a favor because I’m running late.\n" +
                "\n" +
                "Paul Smythe (9:06 A.M.)\n" +
                "Lam, What do you need?\n" +
                "\n" +
                "Jaya Pillay (9:07 A.M.)\n" +
                "Could you say a few words about last weekend's film festival in Atlanta?\n" +
                "\n" +
                "Kristen Tervo (9:07 A.M.)\n" +
                "Wait, what time is the meeting?\n" +
                "\n" +
                "Jaya Pillay (9:08 A.M.)\n" +
                "10:30 A.M,\n" +
                "\n" +
                "Paul Smythe (9:08 A.M.)\n" +
                "Sure, What do you want me to say?\n" +
                "\n" +
                "Kristen Tervo (9:09 A.M.)\n" +
                "Oh tight. I won't be there today. I’m busy working on an issue for David\n" +
                "in Finance.\n" +
                "\n" +
                "Jaya Pillay (9:10 A.M.)\n" +
                "OK. Paul, just say something about how attendance was great, and the\n" +
                "team should feel proud of themselves for their hard work\n" +
                "\n" +
                "Paul Smythe (9:11 A.M.)\n" +
                "Sure. When you arrive, will you be saying anything about the expansion\n" +
                "into Florida next quarter?\n" +
                "\n" +
                "Jaya Pillay (9:12 A.M.)\n" +
                "Yes, but most of the meeting will be about developing strategies to sell\n" +
                "more tickets on opening weekends in our existing theaters.\n" +
                "\n" +
                "Kristen Tervo (9:14 A.M.)\n" +
                "That's good to know. I'm meeting with the vice president of development\n" +
                "tomorrow. I'l be sure to fill her in on what we've been doing,",
                "24 What will be the main focus of the 10:30 AM meeting?","Developing a financial report","Expanding into new territories","Plainning a future festival","Increasing the number of customers","","D", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Jaya Pillay (9:04 A.M.)\n" +
                "Paul and Kristen—are you two going to the meeting this morning? I need\n" +
                "a favor because I’m running late.\n" +
                "\n" +
                "Paul Smythe (9:06 A.M.)\n" +
                "Lam, What do you need?\n" +
                "\n" +
                "Jaya Pillay (9:07 A.M.)\n" +
                "Could you say a few words about last weekend's film festival in Atlanta?\n" +
                "\n" +
                "Kristen Tervo (9:07 A.M.)\n" +
                "Wait, what time is the meeting?\n" +
                "\n" +
                "Jaya Pillay (9:08 A.M.)\n" +
                "10:30 A.M,\n" +
                "\n" +
                "Paul Smythe (9:08 A.M.)\n" +
                "Sure, What do you want me to say?\n" +
                "\n" +
                "Kristen Tervo (9:09 A.M.)\n" +
                "Oh tight. I won't be there today. I’m busy working on an issue for David\n" +
                "in Finance.\n" +
                "\n" +
                "Jaya Pillay (9:10 A.M.)\n" +
                "OK. Paul, just say something about how attendance was great, and the\n" +
                "team should feel proud of themselves for their hard work\n" +
                "\n" +
                "Paul Smythe (9:11 A.M.)\n" +
                "Sure. When you arrive, will you be saying anything about the expansion\n" +
                "into Florida next quarter?\n" +
                "\n" +
                "Jaya Pillay (9:12 A.M.)\n" +
                "Yes, but most of the meeting will be about developing strategies to sell\n" +
                "more tickets on opening weekends in our existing theaters.\n" +
                "\n" +
                "Kristen Tervo (9:14 A.M.)\n" +
                "That's good to know. I'm meeting with the vice president of development\n" +
                "tomorrow. I'l be sure to fill her in on what we've been doing,",
                "25 What does Ms. Tervo say that she will do tomorrow?","Provide an update to a supervisor","Lead a discussion on finances","Develop a marketing strategy","Travel to Atlanta for business","","A", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Listing Type: Single-family properties\n" +
                "Location: Bonatra Acres in Windham County\n" +
                "Last updated: October 28\n" +
                "\n" +
                "Bonatra Acres is a lovely residential community in Windham County featuring\n" +
                "two-, three-, and four-bedroom single-family homes near schools, public\n" +
                "transportation, and beautiful parks.\n" +
                "The Lalique and Grand Barron models feature an eat-in kitchen, a large living area,\n" +
                "and a garage. The Andover model, the most affordable home, is a one-story home\n" +
                "with a patio in the reat. The Mickala is a uniquely-styled home featuring upstairs\n" +
                "bedrooms with oversized windows. The Harrison is a qwo-story model with\n" +
                "modern upgrades.\n" +
                "Properties Currently Available for Sale\n" +
                "\n" +
                "Address | Bedrooms | Bathrooms | Model\n" +
                "\n" +
                "126 Hickory Drive | Three | Two | Grand Barron,\n" +
                "912 Birch Place | Two | One | Andover\n" +
                "21 Lilac Lane | Two | One | Mickala 5x\n" +
                "108 Pine Avenue | Three | One | Lalique Bonatra\n" +
                "\n" +
                "\n" +
                "To: Valerie Sidkoff<v.sidkoff@emikproperties.com>\n" +
                "From: Chung Lai <chunlai@anymail.com>\n" +
                "Date: October 30\n" +
                "Subject: New place to live\n" +
                "\n" +
                "Dear Ms. Sidkoff,\n" +
                "EMIK Properties comes highly recommended by my manager, David Mwabili, who\n" +
                "worked with you to find his business property\n" +
                "1 am wondering whether you also sell residential properties in the area. My wife and I are\n" +
                "ooking to move to Windham County with our children to be closer to our jobs. We will\n" +
                "need easy access to public transportation, 1 would be grateful if you could recommend\n" +
                "some listings for reasonably priced homes in that area, ideally with two or more bedrooms\n" +
                "and at least two bathrooms. I am available to visit homes on Wednesday mornings and\n" +
                "Thursday afternoons.\n" +
                "\n" +
                "Thank you,\n" +
                "\n" +
                "Chan Lai\n" +
                "\n" +
                "June Preston, October 16\n" +
                "I recently purchased a home from EMIK Properties and had the pleasure of\n" +
                "working with Valerie Sidkoff, the company's owner. She patiently showed me\n" +
                "many houses in my preferred area and was attentive to my needs. My only\n" +
                "concern about EMIK Properties is that it seems to prioritize commercial\n" +
                "clients over residential ones. The agency reserves Thursday and Friday\n" +
                "afternoons to show exclusively commercial properties. While this did not\n" +
                "affect me, it could be a problem for others looking to buy a home.",
                "26 What does the listing indicate about Bonatra Acres?","It was built recently","It is located near parks","It features apartment units for sale","It is close to a city","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Listing Type: Single-family properties\n" +
                "Location: Bonatra Acres in Windham County\n" +
                "Last updated: October 28\n" +
                "\n" +
                "Bonatra Acres is a lovely residential community in Windham County featuring\n" +
                "two-, three-, and four-bedroom single-family homes near schools, public\n" +
                "transportation, and beautiful parks.\n" +
                "The Lalique and Grand Barron models feature an eat-in kitchen, a large living area,\n" +
                "and a garage. The Andover model, the most affordable home, is a one-story home\n" +
                "with a patio in the reat. The Mickala is a uniquely-styled home featuring upstairs\n" +
                "bedrooms with oversized windows. The Harrison is a qwo-story model with\n" +
                "modern upgrades.\n" +
                "Properties Currently Available for Sale\n" +
                "\n" +
                "Address | Bedrooms | Bathrooms | Model\n" +
                "\n" +
                "126 Hickory Drive | Three | Two | Grand Barron,\n" +
                "912 Birch Place | Two | One | Andover\n" +
                "21 Lilac Lane | Two | One | Mickala 5x\n" +
                "108 Pine Avenue | Three | One | Lalique Bonatra\n" +
                "\n" +
                "\n" +
                "To: Valerie Sidkoff<v.sidkoff@emikproperties.com>\n" +
                "From: Chung Lai <chunlai@anymail.com>\n" +
                "Date: October 30\n" +
                "Subject: New place to live\n" +
                "\n" +
                "Dear Ms. Sidkoff,\n" +
                "EMIK Properties comes highly recommended by my manager, David Mwabili, who\n" +
                "worked with you to find his business property\n" +
                "1 am wondering whether you also sell residential properties in the area. My wife and I are\n" +
                "ooking to move to Windham County with our children to be closer to our jobs. We will\n" +
                "need easy access to public transportation, 1 would be grateful if you could recommend\n" +
                "some listings for reasonably priced homes in that area, ideally with two or more bedrooms\n" +
                "and at least two bathrooms. I am available to visit homes on Wednesday mornings and\n" +
                "Thursday afternoons.\n" +
                "\n" +
                "Thank you,\n" +
                "\n" +
                "Chan Lai\n" +
                "\n" +
                "June Preston, October 16\n" +
                "I recently purchased a home from EMIK Properties and had the pleasure of\n" +
                "working with Valerie Sidkoff, the company's owner. She patiently showed me\n" +
                "many houses in my preferred area and was attentive to my needs. My only\n" +
                "concern about EMIK Properties is that it seems to prioritize commercial\n" +
                "clients over residential ones. The agency reserves Thursday and Friday\n" +
                "afternoons to show exclusively commercial properties. While this did not\n" +
                "affect me, it could be a problem for others looking to buy a home.",
                "27 What Bonatra Acres model is currently unavailable?","The Lalique","The Grand Barron","The Andover","The Harrison","","D", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Listing Type: Single-family properties\n" +
                "Location: Bonatra Acres in Windham County\n" +
                "Last updated: October 28\n" +
                "\n" +
                "Bonatra Acres is a lovely residential community in Windham County featuring\n" +
                "two-, three-, and four-bedroom single-family homes near schools, public\n" +
                "transportation, and beautiful parks.\n" +
                "The Lalique and Grand Barron models feature an eat-in kitchen, a large living area,\n" +
                "and a garage. The Andover model, the most affordable home, is a one-story home\n" +
                "with a patio in the reat. The Mickala is a uniquely-styled home featuring upstairs\n" +
                "bedrooms with oversized windows. The Harrison is a qwo-story model with\n" +
                "modern upgrades.\n" +
                "Properties Currently Available for Sale\n" +
                "\n" +
                "Address | Bedrooms | Bathrooms | Model\n" +
                "\n" +
                "126 Hickory Drive | Three | Two | Grand Barron,\n" +
                "912 Birch Place | Two | One | Andover\n" +
                "21 Lilac Lane | Two | One | Mickala 5x\n" +
                "108 Pine Avenue | Three | One | Lalique Bonatra\n" +
                "\n" +
                "\n" +
                "To: Valerie Sidkoff<v.sidkoff@emikproperties.com>\n" +
                "From: Chung Lai <chunlai@anymail.com>\n" +
                "Date: October 30\n" +
                "Subject: New place to live\n" +
                "\n" +
                "Dear Ms. Sidkoff,\n" +
                "EMIK Properties comes highly recommended by my manager, David Mwabili, who\n" +
                "worked with you to find his business property\n" +
                "1 am wondering whether you also sell residential properties in the area. My wife and I are\n" +
                "ooking to move to Windham County with our children to be closer to our jobs. We will\n" +
                "need easy access to public transportation, 1 would be grateful if you could recommend\n" +
                "some listings for reasonably priced homes in that area, ideally with two or more bedrooms\n" +
                "and at least two bathrooms. I am available to visit homes on Wednesday mornings and\n" +
                "Thursday afternoons.\n" +
                "\n" +
                "Thank you,\n" +
                "\n" +
                "Chan Lai\n" +
                "\n" +
                "June Preston, October 16\n" +
                "I recently purchased a home from EMIK Properties and had the pleasure of\n" +
                "working with Valerie Sidkoff, the company's owner. She patiently showed me\n" +
                "many houses in my preferred area and was attentive to my needs. My only\n" +
                "concern about EMIK Properties is that it seems to prioritize commercial\n" +
                "clients over residential ones. The agency reserves Thursday and Friday\n" +
                "afternoons to show exclusively commercial properties. While this did not\n" +
                "affect me, it could be a problem for others looking to buy a home.",
                "28 What does the e-mail indicate about Mr. Lai?","He will be getting a new job soon","He heard about EMIK Properties from his supervisor","He owns EMIK Properties","He currently lives in Windham County","","B", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Listing Type: Single-family properties\n" +
                "Location: Bonatra Acres in Windham County\n" +
                "Last updated: October 28\n" +
                "\n" +
                "Bonatra Acres is a lovely residential community in Windham County featuring\n" +
                "two-, three-, and four-bedroom single-family homes near schools, public\n" +
                "transportation, and beautiful parks.\n" +
                "The Lalique and Grand Barron models feature an eat-in kitchen, a large living area,\n" +
                "and a garage. The Andover model, the most affordable home, is a one-story home\n" +
                "with a patio in the reat. The Mickala is a uniquely-styled home featuring upstairs\n" +
                "bedrooms with oversized windows. The Harrison is a qwo-story model with\n" +
                "modern upgrades.\n" +
                "Properties Currently Available for Sale\n" +
                "\n" +
                "Address | Bedrooms | Bathrooms | Model\n" +
                "\n" +
                "126 Hickory Drive | Three | Two | Grand Barron,\n" +
                "912 Birch Place | Two | One | Andover\n" +
                "21 Lilac Lane | Two | One | Mickala 5x\n" +
                "108 Pine Avenue | Three | One | Lalique Bonatra\n" +
                "\n" +
                "\n" +
                "To: Valerie Sidkoff<v.sidkoff@emikproperties.com>\n" +
                "From: Chung Lai <chunlai@anymail.com>\n" +
                "Date: October 30\n" +
                "Subject: New place to live\n" +
                "\n" +
                "Dear Ms. Sidkoff,\n" +
                "EMIK Properties comes highly recommended by my manager, David Mwabili, who\n" +
                "worked with you to find his business property\n" +
                "1 am wondering whether you also sell residential properties in the area. My wife and I are\n" +
                "ooking to move to Windham County with our children to be closer to our jobs. We will\n" +
                "need easy access to public transportation, 1 would be grateful if you could recommend\n" +
                "some listings for reasonably priced homes in that area, ideally with two or more bedrooms\n" +
                "and at least two bathrooms. I am available to visit homes on Wednesday mornings and\n" +
                "Thursday afternoons.\n" +
                "\n" +
                "Thank you,\n" +
                "\n" +
                "Chan Lai\n" +
                "\n" +
                "June Preston, October 16\n" +
                "I recently purchased a home from EMIK Properties and had the pleasure of\n" +
                "working with Valerie Sidkoff, the company's owner. She patiently showed me\n" +
                "many houses in my preferred area and was attentive to my needs. My only\n" +
                "concern about EMIK Properties is that it seems to prioritize commercial\n" +
                "clients over residential ones. The agency reserves Thursday and Friday\n" +
                "afternoons to show exclusively commercial properties. While this did not\n" +
                "affect me, it could be a problem for others looking to buy a home.",
                "29 What Bonatra Arces property best meets Mr. Lai's needs?","126 Hickory Drive","912 Birch Place","21 Lilac Lane","108 Pine Avenue","","A", new BaiThiThu("Test 05",5)));
        dsDocHieu.add(new Part7("Listing Type: Single-family properties\n" +
                "Location: Bonatra Acres in Windham County\n" +
                "Last updated: October 28\n" +
                "\n" +
                "Bonatra Acres is a lovely residential community in Windham County featuring\n" +
                "two-, three-, and four-bedroom single-family homes near schools, public\n" +
                "transportation, and beautiful parks.\n" +
                "The Lalique and Grand Barron models feature an eat-in kitchen, a large living area,\n" +
                "and a garage. The Andover model, the most affordable home, is a one-story home\n" +
                "with a patio in the reat. The Mickala is a uniquely-styled home featuring upstairs\n" +
                "bedrooms with oversized windows. The Harrison is a qwo-story model with\n" +
                "modern upgrades.\n" +
                "Properties Currently Available for Sale\n" +
                "\n" +
                "Address | Bedrooms | Bathrooms | Model\n" +
                "\n" +
                "126 Hickory Drive | Three | Two | Grand Barron,\n" +
                "912 Birch Place | Two | One | Andover\n" +
                "21 Lilac Lane | Two | One | Mickala 5x\n" +
                "108 Pine Avenue | Three | One | Lalique Bonatra\n" +
                "\n" +
                "\n" +
                "To: Valerie Sidkoff<v.sidkoff@emikproperties.com>\n" +
                "From: Chung Lai <chunlai@anymail.com>\n" +
                "Date: October 30\n" +
                "Subject: New place to live\n" +
                "\n" +
                "Dear Ms. Sidkoff,\n" +
                "EMIK Properties comes highly recommended by my manager, David Mwabili, who\n" +
                "worked with you to find his business property\n" +
                "1 am wondering whether you also sell residential properties in the area. My wife and I are\n" +
                "ooking to move to Windham County with our children to be closer to our jobs. We will\n" +
                "need easy access to public transportation, 1 would be grateful if you could recommend\n" +
                "some listings for reasonably priced homes in that area, ideally with two or more bedrooms\n" +
                "and at least two bathrooms. I am available to visit homes on Wednesday mornings and\n" +
                "Thursday afternoons.\n" +
                "\n" +
                "Thank you,\n" +
                "\n" +
                "Chan Lai\n" +
                "\n" +
                "June Preston, October 16\n" +
                "I recently purchased a home from EMIK Properties and had the pleasure of\n" +
                "working with Valerie Sidkoff, the company's owner. She patiently showed me\n" +
                "many houses in my preferred area and was attentive to my needs. My only\n" +
                "concern about EMIK Properties is that it seems to prioritize commercial\n" +
                "clients over residential ones. The agency reserves Thursday and Friday\n" +
                "afternoons to show exclusively commercial properties. While this did not\n" +
                "affect me, it could be a problem for others looking to buy a home.",
                "30 When will Mr. Lai most likely visit properties","On a Wednesday morning","On a Wednesday afternoon","On a Thursday morning","On a Thursday afternoon","","A", new BaiThiThu("Test 05",5)));

        return dsDocHieu;
    }

    public ArrayList<DanhMucTu> getDataDanhMucTu()
    {
        ArrayList<DanhMucTu> ds = new ArrayList<>();
        ds.add(new DanhMucTu(1,"Chào hỏi"));
        ds.add(new DanhMucTu(2,"Hospital"));
        ds.add(new DanhMucTu(3,"School"));
        ds.add(new DanhMucTu(4,"Cảm xúc"));
        ds.add(new DanhMucTu(5,"Kinh doanh"));
        ds.add(new DanhMucTu(6,"Rừng"));
        ds.add(new DanhMucTu(7,"Bất động sản"));
        ds.add(new DanhMucTu(8,"Âm nhạc"));
        ds.add(new DanhMucTu(9,"Thời trang"));
        ds.add(new DanhMucTu(10,"Môi trường"));
        ds.add(new DanhMucTu(11,"Du lịch"));
        ds.add(new DanhMucTu(12,"Đám cưới"));
        ds.add(new DanhMucTu(13,"Biển"));
        ds.add(new DanhMucTu(14,"Thực phẩm"));
        ds.add(new DanhMucTu(15,"Khoa học"));
        ds.add(new DanhMucTu(16,"Công nghệ"));
        return ds;
    }

    public ArrayList<TuVung> getDataReview()
    {
        ArrayList<TuVung> dsTu = new ArrayList<>();
        dsTu.add(new TuVung("Hello","(V)","Xin chào",new DanhMucTu(1,"Chào hỏi")));
        dsTu.add(new TuVung("Hi","(V)","Xin chào",new DanhMucTu(1,"Chào hỏi")));
        dsTu.add(new TuVung("Fine","(N)","Khỏe",new DanhMucTu(1,"Chào hỏi")));
        dsTu.add(new TuVung("Old","(N)","Tuổi",new DanhMucTu(1,"Chào hỏi")));
        dsTu.add(new TuVung("Nurse","(N)","Y tá",new DanhMucTu(2,"Hospital")));
        dsTu.add(new TuVung("Doctor","(N)","Bác sĩ",new DanhMucTu(2,"Hospital")));
        dsTu.add(new TuVung("Emergency","(N)","Khẩn cấp",new DanhMucTu(2,"Hospital")));
        dsTu.add(new TuVung("Delivery","(N)","Phòng sinh nở",new DanhMucTu(2,"Hospital")));
        dsTu.add(new TuVung("Laboratory","(N)","Phòng xét nghiệm",new DanhMucTu(2,"Hospital")));
        dsTu.add(new TuVung("Student","(N)","Học sinh, sinh viên",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("Academy","(N)","Học viện",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("Primary school","(N)","Trường tiểu học",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("Secondary school","(N)","Trường trung học cơ sở",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("High school","(N)","Trường trung học phổ thông",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("Public school","(N)","Trường công",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("Private school","(N)","Trường tư",new DanhMucTu(3,"School")));
        dsTu.add(new TuVung("Sad","(A)","Buồn",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Scared","(A)","Sợ hãi",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Angry","(A)","Tức giận",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Anxious","(A)","Lo lắng",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Annoyed","(A)","Bực mình",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Appalled","(A)","Rất sốc",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Horrified","(A)","Sợ hãi tột độ",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Apprehensive","(A)","Hơi lo lắng",new DanhMucTu(4,"Cảm xúc")));
        dsTu.add(new TuVung("Company","(N)","Công ty, xí nghiệp",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Affiliate","(N)","Công ty liên kết",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Subsidiary","(N)","Công ty con",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Consortium/ corporation","(N)","Tập đoàn",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Headquarters","(N)","Trụ sở chính",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Launch","(V)","Tung ra sản phẩm",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Transaction","(V)","Giao dịch",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Cooperation","(V)","Hợp tác",new DanhMucTu(5,"Kinh doanh")));
        dsTu.add(new TuVung("Meadow","(N)","Đồng cỏ",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Jungle","(N)","Rừng nhiệt đới",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Forest","(N)","Rừng sinh thái",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Mountain","(N)","Núi",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Brink","(N)","Bờ vực",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Rainforest","(N)","Rừng mưa",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Canyon","(N)","Hẻm núi",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Hill","(N)","Đồi",new DanhMucTu(6,"Rừng")));
        dsTu.add(new TuVung("Project","(N)","Dự án",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Real Estate","(N)","Ngành bất động sản",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Developer","(N)","Nhà phát triển",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Architect","(N)","Kiến trúc sư",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Supervisor","(V)","Giám sát",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Investor","(N)","Chủ đầu tư",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Constructo","(N)","Nhà thầu thi công",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Property / Properties","(N)","Tài sản",new DanhMucTu(7,"Bất động sản")));
        dsTu.add(new TuVung("Classical","(N)","Nhạc cổ điển",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Electronic","(N)","Nhạc điện tử",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Easy listening","(N)","Nhạc dễ nghe",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Folk","(N)","Nhạc dân ca",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Rap","(N)","Nhạc Rap",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Dance","(N)","Nhạc nhảy",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Jazz","(N)","Nhạc jazz",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Blue","(N)","Nhạc buồn",new DanhMucTu(8,"Âm nhạc")));
        dsTu.add(new TuVung("Dress","(N)","Váy liền",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Miniskirt","(N)","Váy ngắn",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Skirt","(N)","Chân váy",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Blouse","(N)","Áo sơ mi nữ",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Cardigan","(N)","Áo len cài đằng trước",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Tights","(N)","Quần tất",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Nightie","(N)","Váy ngủ",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Body","(N)","Váy bó sát",new DanhMucTu(9,"Thời trang")));
        dsTu.add(new TuVung("Atmosphere","(N)","Khí quyển",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Biodiversity","(N)","Sự đa dạng sinh học",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Catastrophe","(N)","Thảm họa ",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Climate","(N)","Khí hậu",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Creature","(N)","Sinh vật",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Deforestation","(N)","Sự phá rừng",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Dust","(N)","Bụi bẩn",new DanhMucTu(10,"Môi trường")));
        dsTu.add(new TuVung("Passport","(N)","Hộ chiếu",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("International tourist","(N)","Khách du lịch quốc tế",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("UNWTO","(V)","Tổ chức Du lịch Thế giới",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("Bus schedule","(N)","Lịch trình xe buýt",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("Round trip","(N)","Chuyến bay khứ hồi",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("Ticket","(N)","Vé",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("Inclusive tour","(N)","Tour du lịch trọn gói",new DanhMucTu(11,"Du lịch")));
        dsTu.add(new TuVung("To attend a wedding","(V)","Đi đám cưới",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("To get married","(V)","Kết hôn",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Bride","(N)","Cô dâu",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Groom","(N)","Chú rể",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Wedding dress","(N)","Váy cưới",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Bridesmaids","(N)","Phụ dâu",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Matching dresses","(N)","Váy của phụ dâu",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Groomsman","(N)","Phụ rể",new DanhMucTu(12,"Đám cưới")));
        dsTu.add(new TuVung("Sea","(N)","Biển",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Ocean","(N)","Đại dương",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Wave","(N)","Sóng",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Island","(N)","Hòn đảo",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Harbor, Port","(N)","Cảng biển",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Lighthouse","(N)","Hải đăng",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Submarine","(N)","Tàu ngầm",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Ship","(N)","Tàu",new DanhMucTu(13,"Biển")));
        dsTu.add(new TuVung("Appetizer","(N)","Món khai vị",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Main Courses","(N)","Món chính",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Vegetable","(N)","Rau củ",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Desserts","(N)","Tráng miệng",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Fruit","(N)","Trái cây",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Roasted","(V)","Quay",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Mixed","(V)","Trộn",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Fastfood","(N)","Thức ăn nhanh",new DanhMucTu(14,"Thực phẩm")));
        dsTu.add(new TuVung("Experiment","(V)","Thí nghiệm",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Gene","(N)","Gen",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("High-Tech / Hi-Tech","(N)","Công nghệ cao",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Theory","(N)","Lý thuyết",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Evolution","(N)","Sự tiến hóa",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Universe","(N)","Vũ trụ",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Cyber","(N)","Máy tính và Internet",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Clone","(V)","Nhân bản vô tính",new DanhMucTu(15,"Khoa học")));
        dsTu.add(new TuVung("Appliance","(N)","Bàn tính",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Abacus","(N)","Thiết bị, máy móc",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Circuit","(N)","Mạch",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Computer","(N)","Máy tính",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Device","(N)","Proplayer Astralis",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Disk","(N)","Đĩa",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Hardware","(N)","Phần cứng",new DanhMucTu(16,"Công nghệ")));
        dsTu.add(new TuVung("Memory","(N)","Bộ nhớ",new DanhMucTu(16,"Công nghệ")));
        return dsTu;
    }
}
