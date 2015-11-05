## generator-cyclops

This is a simple Cyclops mod template generator.

### Requirements

* [Node](https://nodejs.org/en/)
* [Yo](https://www.npmjs.com/package/yo)

### Usage

Run `npm link` in this directory for installing this generator.
Running `yo cyclops:mod` will create a new mod directory based on the answers you provide to the questions.

You will need to fill in the following things when using this template:

* Update secret keys and repo locations in `.travis.yml`

If using travis, you will need to enter the following secrets in your build settings:
* `CURSEFORGE_KEY_SECRET`: Your curseforge key for automatic release publishing when a new tag is pushed
* `MAVEN_URL`: (Optional), for automatic dev build publishing
* `MAVEN_USERNAME`: (Optional), maven username for the dev build publishing
* `MAVEN_KEY`: (Optional), maven password for the dev build publishing

### Branching Strategy

For every major Minecraft version, two branches exist:

* `master-{mc_version}`: Latest (potentially unstable) development.
* `release-{mc_version}`: Latest stable release for that Minecraft version. This is also tagged with all mod releases.

### License
All code and images are licenced under the [MIT License](https://github.com/CyclopsMC/generator-cyclops/blob/master-1.8/LICENSE.txt)
