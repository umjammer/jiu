[![Release](https://jitpack.io/v/umjammer/jiu.svg)](https://jitpack.io/#umjammer/jiu)
 [![Parent](https://img.shields.io/badge/Parent-vavi--image--sandbox-pink)](https://github.com/umjammer/vavi-image-sandbox)
 
# JIU - Java Imaging Utilities - README file

JIU is a Java library to load, process, analyze and save pixel images.

The project's Web site is at <http://jiu.sourceforge.net/>.

In 2009 the JIU project, which seems to have been unmaintained for a while,
was picked up by a new author (Knut Arild Erstad) and is back on SourceForge.
Please understand that I do not have full knowledge of the library, and have
not been able to contact the original author.  A new maintainer naturally also
means that priorities will change, so take the TODO list with more than a
grain of salt.

If you want to give feedback (questions, suggestions, bug reports), 
please write a message on the Open Discussion Forum at 
<http://sourceforge.net/forum/forum.php?forum_id=51534>. Please
check the subjects, the question you want to ask may already have been
answered.

The library is distributed under the GNU General Public License version 
2. See the LICENSE file that is part of the distribution or visit 
<http://www.gnu.org/copyleft/gpl.html>.

Documentation right now consists of the following items:
* ChangeLog - changes in reverse chronological order
* TODO - what's to be changed / added / removed next
* API docs - the classes, their methods and fields, as HTML / PDF / PS / DVI
* Manual - a general introduction (only in an early stage)

In order to get an impression of what JIU can do, check out the jiuawt
demo.

One option is to visit <http://schmidt.devlib.org/jiu/applet.html>.
If you have Java installed and activated within your Web browser, it
should be the easier and quicker way. However, you are restricted to a
single image file.

In order to test jiuawt with your own image files, start the jiuawt demo
program that is part of the library. You must have a Java Runtime Environment
version 1.1 or higher installed (typing `java -version` on the command 
line should tell you whether you have one and which version it is). Once 
you have downloaded and decompressed the JIU distribution archive (the
.tar.bz2 file), go to the directory where you have decompressed it.
That directory will contain `jiu.jar`. Start it

* by typing `run-jiuawt.bat` (under Windows only),
* by typing `java -jar jiu.jar`,
* by double-clicking on `jiu.jar` in a file manager or
* by typing `java -cp jiu.jar net.sourceforge.jiu.apps.jiuawt`.

jiuawt requires Java 1.1+, so it should run with most virtual machines
in use. Note that by default Java VMs only get to use a certain amount
of memory. With images one easily reaches that limit. Provide the VM
with more memory by starting it with `-mx<MB>m` as parameter between `java` and
`-cp` (or `-jar`). So `java -mx256m -jar jiu.jar` would start the program and
give 256 MB to it. You may want to adjust that value according to your
needs.
