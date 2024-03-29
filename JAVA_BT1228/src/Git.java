
public class Git {

	public static void main(String[] args) {
		// 1. Git
		// - 버전 관리 시스템
		//  : 변경 사항 추적, 백업 및 보안, 협업 용이성
		
		// - working directory
		// : 개인 작업 환경 (add)
		
		// - staging area
		// : 저장소에서 업데이트 하려는 변경사항을 모아두는 곳 (commit)
		
		// - local repository
		// : 개인 PC에 저장되는 저장소 (push)
		
		// - remote repository
		// : 다른 개발자와 공유하는 저장소 (pull)
		
		// 2. GitHub
		// : Git을 사용하는 프로젝트를 지원하는 웹 호스팅 서비스
		
		// - git push와 git pull 명령어를 사용하여 로컬 리포지토리와 원격 리포지토리 간의 동기화
		
		// 3. Git 설치
		// : Git 공식 웹사이트 - 운영체제에 맞는 버전을 다운로드
		
		// 4. 사용자 이름 및 이메일 설정
		// : 커밋에 사용자 정보를 기록하는데 사용
		
			// >> windows 자격 증명 관리자 
			// >> windows 자격 증명 >> 일반 자격 증명 (git, sourcetree이 타인의 것 - 삭제)
		
		// - 브라우저에서 github 로그인 상태 확인
		
		// MacOS(터미널), windows(윈도우키 + cmd)
		
//		git config --global user.name (깃허브아이디)
//		git config --global user.emaill (깃허브이메일)
		
//		ex) git config --global user.name devgiants75
//		ex) git config --global user.email devgiants75@naver.com
		
		// - 등록 확인
		// git config --global user.name
		// git config --global user.email
		
		
				
		
		// 원격 리포지토리 (GitHub) 연결
		// : 로컬 Git 리포지토리에서 원격 리포지토리를 연결
		// : GitHub 리포지토리 페이지에서 제공하는 URL 사용
		
		// 리포지토리 초기화 및 기본 운영
		// a. 리포지토리 초기화 및 기본 운영
		// : 새로운 Git 리포지토리 생성
		// : git init 명령어 사용
		// : 새로운 Git 리포지토리를 초기화 하고 .git 디렉토리를 생성
		
		// b. 상태확인 (status)
		// : 리포지토리의 현재 상태 확인
		// : 업로드(push) 하지 않은 파일이 있는지 확인
		// : git status 명렁어 사용
		 
		// c. 파일 추가 (add)
		// : git add .
		// : 마침표는 전체 변경 사항을 모두 업로드
		
		// d. 커밋(commit)
		// : 변경 사항을 리포지토리에 기록하기 위한 명령어
		// git commit -m "커밋메시지 - 코드에대한 설명"
		// git commit -m "20240104 java"
		
		// e. 코드 푸시 (push)
		// : 로컬 리포지토리에서 변경사항을 원격 리포지토리에 저장
		// git push origin main
		
		//=============================================//
		
		// 원격 리포지토리(깃허브) 연결
		  
		// >> 연동 전 해당 리포지토리의 파일을 받아올 폴더에
		// : 리포지토리 초기화(init) 실시 : git init
		 
		// >> branch 변경(main)
		// : git branch -M main
		  
		// >> 로컬 Git 리포지토리에서 원격 리포지토리를 연결
		// : GitHub에서 제공하는 URL 사용
		// : git remote add origin 원격리포지토리URL
		
		// >> 원격 리포지토리에서 파일 당겨오기
		// : git pull origin main
		
	}

}
