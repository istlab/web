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
 * @composed 1 has * Group
 * @has - - - Member
 * @has - - - Publication
 * @has - - - Project
 */
class ResearchCenter {}

/**
 * @has - - - Member
 * @has - - - Publication
 * @has - - - Project
 */
class Group {}

/**
 * @has - - - Publication
 */
class Member {}

/**
 * @has - - - Publication
 */
class Project {}

class Publication {}

/**
 * @has - - - Member
 */
class Seminar {}

/**
 * @has - - - Group
 */
class additional_pages {}
