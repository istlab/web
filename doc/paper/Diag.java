/**
 * $Id$
 *
 */

import java.util.Date;

/**
 *
 * @opt attributes
 * @opt types
 * @hidden
 */
class UMLOptions {}

/**
 * @composed "\n1" " has" "\n*" Group
 * @has "\n\n1" "\nhas" * Member
 * @assoc "1..*" has 1 Publication
 * @assoc "1..*" participates "  1..*" Project
 */
class Group {}

/**
 * @assoc "1..*" has "  0..*" Publication
 */
class Member {}

/**
 * @assoc "0..*" has "  0..*" Publication
 */
class Project {}

class Publication {}

/**
 * @assoc 0..* present "  1..*" Member
 */
class Seminar {}

/**
 * @assoc 0..* has "1" Group
 */
class additional_pages {}
