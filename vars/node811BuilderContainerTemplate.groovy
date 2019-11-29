def call() {
	return [
		containerTemplate(
			name: 'node811-builder',
			image: 'circleci/node:9.11.2',
			command: 'cat',
			ttyEnabled: true
		)
	]
}