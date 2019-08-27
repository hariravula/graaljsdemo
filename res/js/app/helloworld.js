function helloWorld() {
	return 'Hello, world!';
}

function printHello() {
	console.log(helloWorld());
}

function printHi() {
	// calling a function in a different file. 
	console.log(hi());
}