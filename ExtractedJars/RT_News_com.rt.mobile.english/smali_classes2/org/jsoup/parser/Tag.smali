.class public Lorg/jsoup/parser/Tag;
.super Ljava/lang/Object;
.source "Tag.java"


# static fields
.field private static final blockTags:[Ljava/lang/String;

.field private static final emptyTags:[Ljava/lang/String;

.field private static final formListedTags:[Ljava/lang/String;

.field private static final formSubmitTags:[Ljava/lang/String;

.field private static final formatAsInlineTags:[Ljava/lang/String;

.field private static final inlineTags:[Ljava/lang/String;

.field private static final preserveWhitespaceTags:[Ljava/lang/String;

.field private static final tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/jsoup/parser/Tag;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private canContainBlock:Z

.field private canContainInline:Z

.field private empty:Z

.field private formList:Z

.field private formSubmit:Z

.field private formatAsBlock:Z

.field private isBlock:Z

.field private preserveWhitespace:Z

.field private selfClosing:Z

.field private tagName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    const/16 v0, 0x3b

    .line 221
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "html"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "head"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "body"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "frameset"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "script"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "noscript"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    const-string v1, "style"

    const/4 v8, 0x6

    aput-object v1, v0, v8

    const-string v1, "meta"

    const/4 v9, 0x7

    aput-object v1, v0, v9

    const-string v1, "link"

    const/16 v10, 0x8

    aput-object v1, v0, v10

    const-string v1, "title"

    const/16 v11, 0x9

    aput-object v1, v0, v11

    const-string v1, "frame"

    const/16 v12, 0xa

    aput-object v1, v0, v12

    const-string v1, "noframes"

    const/16 v13, 0xb

    aput-object v1, v0, v13

    const-string v1, "section"

    const/16 v14, 0xc

    aput-object v1, v0, v14

    const-string v1, "nav"

    const/16 v15, 0xd

    aput-object v1, v0, v15

    const-string v1, "aside"

    const/16 v16, 0xe

    aput-object v1, v0, v16

    const-string v1, "hgroup"

    const/16 v17, 0xf

    aput-object v1, v0, v17

    const-string v1, "header"

    const/16 v17, 0x10

    aput-object v1, v0, v17

    const-string v1, "footer"

    const/16 v17, 0x11

    aput-object v1, v0, v17

    const-string v1, "p"

    const/16 v17, 0x12

    aput-object v1, v0, v17

    const-string v1, "h1"

    const/16 v17, 0x13

    aput-object v1, v0, v17

    const-string v1, "h2"

    const/16 v17, 0x14

    aput-object v1, v0, v17

    const-string v1, "h3"

    const/16 v17, 0x15

    aput-object v1, v0, v17

    const-string v1, "h4"

    const/16 v17, 0x16

    aput-object v1, v0, v17

    const-string v1, "h5"

    const/16 v17, 0x17

    aput-object v1, v0, v17

    const-string v1, "h6"

    const/16 v17, 0x18

    aput-object v1, v0, v17

    const-string v1, "ul"

    const/16 v17, 0x19

    aput-object v1, v0, v17

    const-string v1, "ol"

    const/16 v17, 0x1a

    aput-object v1, v0, v17

    const-string v1, "pre"

    const/16 v17, 0x1b

    aput-object v1, v0, v17

    const-string v1, "div"

    const/16 v17, 0x1c

    aput-object v1, v0, v17

    const-string v1, "blockquote"

    const/16 v17, 0x1d

    aput-object v1, v0, v17

    const-string v1, "hr"

    const/16 v17, 0x1e

    aput-object v1, v0, v17

    const-string v1, "address"

    const/16 v17, 0x1f

    aput-object v1, v0, v17

    const-string v1, "figure"

    const/16 v17, 0x20

    aput-object v1, v0, v17

    const-string v1, "figcaption"

    const/16 v17, 0x21

    aput-object v1, v0, v17

    const-string v1, "form"

    const/16 v17, 0x22

    aput-object v1, v0, v17

    const-string v1, "fieldset"

    const/16 v17, 0x23

    aput-object v1, v0, v17

    const-string v1, "ins"

    const/16 v17, 0x24

    aput-object v1, v0, v17

    const-string v1, "del"

    const/16 v17, 0x25

    aput-object v1, v0, v17

    const-string v1, "s"

    const/16 v17, 0x26

    aput-object v1, v0, v17

    const-string v1, "dl"

    const/16 v17, 0x27

    aput-object v1, v0, v17

    const-string v1, "dt"

    const/16 v17, 0x28

    aput-object v1, v0, v17

    const-string v1, "dd"

    const/16 v17, 0x29

    aput-object v1, v0, v17

    const-string v1, "li"

    const/16 v17, 0x2a

    aput-object v1, v0, v17

    const-string v1, "table"

    const/16 v17, 0x2b

    aput-object v1, v0, v17

    const-string v1, "caption"

    const/16 v17, 0x2c

    aput-object v1, v0, v17

    const-string v1, "thead"

    const/16 v17, 0x2d

    aput-object v1, v0, v17

    const-string v1, "tfoot"

    const/16 v17, 0x2e

    aput-object v1, v0, v17

    const-string v1, "tbody"

    const/16 v17, 0x2f

    aput-object v1, v0, v17

    const-string v1, "colgroup"

    const/16 v17, 0x30

    aput-object v1, v0, v17

    const-string v1, "col"

    const/16 v17, 0x31

    aput-object v1, v0, v17

    const-string v1, "tr"

    const/16 v17, 0x32

    aput-object v1, v0, v17

    const-string v1, "th"

    const/16 v17, 0x33

    aput-object v1, v0, v17

    const-string v1, "td"

    const/16 v17, 0x34

    aput-object v1, v0, v17

    const-string v1, "video"

    const/16 v17, 0x35

    aput-object v1, v0, v17

    const-string v1, "audio"

    const/16 v17, 0x36

    aput-object v1, v0, v17

    const-string v1, "canvas"

    const/16 v17, 0x37

    aput-object v1, v0, v17

    const-string v1, "details"

    const/16 v17, 0x38

    aput-object v1, v0, v17

    const-string v1, "menu"

    const/16 v17, 0x39

    aput-object v1, v0, v17

    const-string v1, "plaintext"

    const/16 v17, 0x3a

    aput-object v1, v0, v17

    sput-object v0, Lorg/jsoup/parser/Tag;->blockTags:[Ljava/lang/String;

    const/16 v0, 0x3f

    .line 228
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "object"

    aput-object v1, v0, v2

    const-string v1, "base"

    aput-object v1, v0, v3

    const-string v1, "font"

    aput-object v1, v0, v4

    const-string v1, "tt"

    aput-object v1, v0, v5

    const-string v1, "i"

    aput-object v1, v0, v6

    const-string v1, "b"

    aput-object v1, v0, v7

    const-string v1, "u"

    aput-object v1, v0, v8

    const-string v1, "big"

    aput-object v1, v0, v9

    const-string v1, "small"

    aput-object v1, v0, v10

    const-string v1, "em"

    aput-object v1, v0, v11

    const-string v1, "strong"

    aput-object v1, v0, v12

    const-string v1, "dfn"

    aput-object v1, v0, v13

    const-string v1, "code"

    aput-object v1, v0, v14

    const-string v1, "samp"

    aput-object v1, v0, v15

    const-string v1, "kbd"

    aput-object v1, v0, v16

    const-string v1, "var"

    const/16 v17, 0xf

    aput-object v1, v0, v17

    const-string v1, "cite"

    const/16 v17, 0x10

    aput-object v1, v0, v17

    const-string v1, "abbr"

    const/16 v17, 0x11

    aput-object v1, v0, v17

    const-string v1, "time"

    const/16 v17, 0x12

    aput-object v1, v0, v17

    const-string v1, "acronym"

    const/16 v17, 0x13

    aput-object v1, v0, v17

    const-string v1, "mark"

    const/16 v17, 0x14

    aput-object v1, v0, v17

    const-string v1, "ruby"

    const/16 v17, 0x15

    aput-object v1, v0, v17

    const-string v1, "rt"

    const/16 v17, 0x16

    aput-object v1, v0, v17

    const-string v1, "rp"

    const/16 v17, 0x17

    aput-object v1, v0, v17

    const-string v1, "a"

    const/16 v17, 0x18

    aput-object v1, v0, v17

    const-string v1, "img"

    const/16 v17, 0x19

    aput-object v1, v0, v17

    const-string v1, "br"

    const/16 v17, 0x1a

    aput-object v1, v0, v17

    const-string v1, "wbr"

    const/16 v17, 0x1b

    aput-object v1, v0, v17

    const-string v1, "map"

    const/16 v17, 0x1c

    aput-object v1, v0, v17

    const-string v1, "q"

    const/16 v17, 0x1d

    aput-object v1, v0, v17

    const-string v1, "sub"

    const/16 v17, 0x1e

    aput-object v1, v0, v17

    const-string v1, "sup"

    const/16 v17, 0x1f

    aput-object v1, v0, v17

    const-string v1, "bdo"

    const/16 v17, 0x20

    aput-object v1, v0, v17

    const-string v1, "iframe"

    const/16 v17, 0x21

    aput-object v1, v0, v17

    const-string v1, "embed"

    const/16 v17, 0x22

    aput-object v1, v0, v17

    const-string v1, "span"

    const/16 v17, 0x23

    aput-object v1, v0, v17

    const-string v1, "input"

    const/16 v17, 0x24

    aput-object v1, v0, v17

    const-string v1, "select"

    const/16 v17, 0x25

    aput-object v1, v0, v17

    const-string v1, "textarea"

    const/16 v17, 0x26

    aput-object v1, v0, v17

    const-string v1, "label"

    const/16 v17, 0x27

    aput-object v1, v0, v17

    const-string v1, "button"

    const/16 v17, 0x28

    aput-object v1, v0, v17

    const-string v1, "optgroup"

    const/16 v17, 0x29

    aput-object v1, v0, v17

    const-string v1, "option"

    const/16 v17, 0x2a

    aput-object v1, v0, v17

    const-string v1, "legend"

    const/16 v17, 0x2b

    aput-object v1, v0, v17

    const-string v1, "datalist"

    const/16 v17, 0x2c

    aput-object v1, v0, v17

    const-string v1, "keygen"

    const/16 v17, 0x2d

    aput-object v1, v0, v17

    const-string v1, "output"

    const/16 v17, 0x2e

    aput-object v1, v0, v17

    const-string v1, "progress"

    const/16 v17, 0x2f

    aput-object v1, v0, v17

    const-string v1, "meter"

    const/16 v17, 0x30

    aput-object v1, v0, v17

    const-string v1, "area"

    const/16 v17, 0x31

    aput-object v1, v0, v17

    const-string v1, "param"

    const/16 v17, 0x32

    aput-object v1, v0, v17

    const-string v1, "source"

    const/16 v17, 0x33

    aput-object v1, v0, v17

    const-string v1, "track"

    const/16 v17, 0x34

    aput-object v1, v0, v17

    const-string v1, "summary"

    const/16 v17, 0x35

    aput-object v1, v0, v17

    const-string v1, "command"

    const/16 v17, 0x36

    aput-object v1, v0, v17

    const-string v1, "device"

    const/16 v17, 0x37

    aput-object v1, v0, v17

    const-string v1, "area"

    const/16 v17, 0x38

    aput-object v1, v0, v17

    const-string v1, "basefont"

    const/16 v17, 0x39

    aput-object v1, v0, v17

    const-string v1, "bgsound"

    const/16 v17, 0x3a

    aput-object v1, v0, v17

    const-string v1, "menuitem"

    const/16 v17, 0x3b

    aput-object v1, v0, v17

    const-string v1, "param"

    const/16 v17, 0x3c

    aput-object v1, v0, v17

    const-string v1, "source"

    const/16 v17, 0x3d

    aput-object v1, v0, v17

    const-string v1, "track"

    const/16 v17, 0x3e

    aput-object v1, v0, v17

    sput-object v0, Lorg/jsoup/parser/Tag;->inlineTags:[Ljava/lang/String;

    const/16 v0, 0x15

    .line 235
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "meta"

    aput-object v1, v0, v2

    const-string v1, "link"

    aput-object v1, v0, v3

    const-string v1, "base"

    aput-object v1, v0, v4

    const-string v1, "frame"

    aput-object v1, v0, v5

    const-string v1, "img"

    aput-object v1, v0, v6

    const-string v1, "br"

    aput-object v1, v0, v7

    const-string v1, "wbr"

    aput-object v1, v0, v8

    const-string v1, "embed"

    aput-object v1, v0, v9

    const-string v1, "hr"

    aput-object v1, v0, v10

    const-string v1, "input"

    aput-object v1, v0, v11

    const-string v1, "keygen"

    aput-object v1, v0, v12

    const-string v1, "col"

    aput-object v1, v0, v13

    const-string v1, "command"

    aput-object v1, v0, v14

    const-string v1, "device"

    aput-object v1, v0, v15

    const-string v1, "area"

    aput-object v1, v0, v16

    const-string v1, "basefont"

    const/16 v17, 0xf

    aput-object v1, v0, v17

    const-string v1, "bgsound"

    const/16 v17, 0x10

    aput-object v1, v0, v17

    const-string v1, "menuitem"

    const/16 v17, 0x11

    aput-object v1, v0, v17

    const-string v1, "param"

    const/16 v17, 0x12

    aput-object v1, v0, v17

    const-string v1, "source"

    const/16 v17, 0x13

    aput-object v1, v0, v17

    const-string v1, "track"

    const/16 v17, 0x14

    aput-object v1, v0, v17

    sput-object v0, Lorg/jsoup/parser/Tag;->emptyTags:[Ljava/lang/String;

    const/16 v0, 0x13

    .line 239
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "title"

    aput-object v1, v0, v2

    const-string v1, "a"

    aput-object v1, v0, v3

    const-string v1, "p"

    aput-object v1, v0, v4

    const-string v1, "h1"

    aput-object v1, v0, v5

    const-string v1, "h2"

    aput-object v1, v0, v6

    const-string v1, "h3"

    aput-object v1, v0, v7

    const-string v1, "h4"

    aput-object v1, v0, v8

    const-string v1, "h5"

    aput-object v1, v0, v9

    const-string v1, "h6"

    aput-object v1, v0, v10

    const-string v1, "pre"

    aput-object v1, v0, v11

    const-string v1, "address"

    aput-object v1, v0, v12

    const-string v1, "li"

    aput-object v1, v0, v13

    const-string v1, "th"

    aput-object v1, v0, v14

    const-string v1, "td"

    aput-object v1, v0, v15

    const-string v1, "script"

    aput-object v1, v0, v16

    const-string v1, "style"

    const/16 v11, 0xf

    aput-object v1, v0, v11

    const-string v1, "ins"

    const/16 v11, 0x10

    aput-object v1, v0, v11

    const-string v1, "del"

    const/16 v11, 0x11

    aput-object v1, v0, v11

    const-string v1, "s"

    const/16 v11, 0x12

    aput-object v1, v0, v11

    sput-object v0, Lorg/jsoup/parser/Tag;->formatAsInlineTags:[Ljava/lang/String;

    .line 243
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "pre"

    aput-object v1, v0, v2

    const-string v1, "plaintext"

    aput-object v1, v0, v3

    const-string v1, "title"

    aput-object v1, v0, v4

    const-string v1, "textarea"

    aput-object v1, v0, v5

    sput-object v0, Lorg/jsoup/parser/Tag;->preserveWhitespaceTags:[Ljava/lang/String;

    .line 248
    new-array v0, v10, [Ljava/lang/String;

    const-string v1, "button"

    aput-object v1, v0, v2

    const-string v1, "fieldset"

    aput-object v1, v0, v3

    const-string v1, "input"

    aput-object v1, v0, v4

    const-string v1, "keygen"

    aput-object v1, v0, v5

    const-string v1, "object"

    aput-object v1, v0, v6

    const-string v1, "output"

    aput-object v1, v0, v7

    const-string v1, "select"

    aput-object v1, v0, v8

    const-string v1, "textarea"

    aput-object v1, v0, v9

    sput-object v0, Lorg/jsoup/parser/Tag;->formListedTags:[Ljava/lang/String;

    .line 251
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "input"

    aput-object v1, v0, v2

    const-string v1, "keygen"

    aput-object v1, v0, v3

    const-string v1, "object"

    aput-object v1, v0, v4

    const-string v1, "select"

    aput-object v1, v0, v5

    const-string v1, "textarea"

    aput-object v1, v0, v6

    sput-object v0, Lorg/jsoup/parser/Tag;->formSubmitTags:[Ljava/lang/String;

    .line 257
    sget-object v0, Lorg/jsoup/parser/Tag;->blockTags:[Ljava/lang/String;

    array-length v1, v0

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    .line 258
    new-instance v6, Lorg/jsoup/parser/Tag;

    invoke-direct {v6, v5}, Lorg/jsoup/parser/Tag;-><init>(Ljava/lang/String;)V

    .line 259
    invoke-static {v6}, Lorg/jsoup/parser/Tag;->register(Lorg/jsoup/parser/Tag;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 261
    :cond_0
    sget-object v0, Lorg/jsoup/parser/Tag;->inlineTags:[Ljava/lang/String;

    array-length v1, v0

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_1

    aget-object v5, v0, v4

    .line 262
    new-instance v6, Lorg/jsoup/parser/Tag;

    invoke-direct {v6, v5}, Lorg/jsoup/parser/Tag;-><init>(Ljava/lang/String;)V

    .line 263
    iput-boolean v2, v6, Lorg/jsoup/parser/Tag;->isBlock:Z

    .line 264
    iput-boolean v2, v6, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    .line 265
    iput-boolean v2, v6, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    .line 266
    invoke-static {v6}, Lorg/jsoup/parser/Tag;->register(Lorg/jsoup/parser/Tag;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 270
    :cond_1
    sget-object v0, Lorg/jsoup/parser/Tag;->emptyTags:[Ljava/lang/String;

    array-length v1, v0

    move v4, v2

    :goto_2
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    .line 271
    sget-object v6, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/jsoup/parser/Tag;

    .line 272
    invoke-static {v5}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 273
    iput-boolean v2, v5, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    .line 274
    iput-boolean v2, v5, Lorg/jsoup/parser/Tag;->canContainInline:Z

    .line 275
    iput-boolean v3, v5, Lorg/jsoup/parser/Tag;->empty:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 278
    :cond_2
    sget-object v0, Lorg/jsoup/parser/Tag;->formatAsInlineTags:[Ljava/lang/String;

    array-length v1, v0

    move v4, v2

    :goto_3
    if-ge v4, v1, :cond_3

    aget-object v5, v0, v4

    .line 279
    sget-object v6, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/jsoup/parser/Tag;

    .line 280
    invoke-static {v5}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 281
    iput-boolean v2, v5, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 284
    :cond_3
    sget-object v0, Lorg/jsoup/parser/Tag;->preserveWhitespaceTags:[Ljava/lang/String;

    array-length v1, v0

    move v4, v2

    :goto_4
    if-ge v4, v1, :cond_4

    aget-object v5, v0, v4

    .line 285
    sget-object v6, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/jsoup/parser/Tag;

    .line 286
    invoke-static {v5}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 287
    iput-boolean v3, v5, Lorg/jsoup/parser/Tag;->preserveWhitespace:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 290
    :cond_4
    sget-object v0, Lorg/jsoup/parser/Tag;->formListedTags:[Ljava/lang/String;

    array-length v1, v0

    move v4, v2

    :goto_5
    if-ge v4, v1, :cond_5

    aget-object v5, v0, v4

    .line 291
    sget-object v6, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/jsoup/parser/Tag;

    .line 292
    invoke-static {v5}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 293
    iput-boolean v3, v5, Lorg/jsoup/parser/Tag;->formList:Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 296
    :cond_5
    sget-object v0, Lorg/jsoup/parser/Tag;->formSubmitTags:[Ljava/lang/String;

    array-length v1, v0

    :goto_6
    if-ge v2, v1, :cond_6

    aget-object v4, v0, v2

    .line 297
    sget-object v5, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jsoup/parser/Tag;

    .line 298
    invoke-static {v4}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 299
    iput-boolean v3, v4, Lorg/jsoup/parser/Tag;->formSubmit:Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_6
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->isBlock:Z

    .line 18
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    .line 19
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    .line 20
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->canContainInline:Z

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->empty:Z

    .line 22
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->selfClosing:Z

    .line 23
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->preserveWhitespace:Z

    .line 24
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->formList:Z

    .line 25
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->formSubmit:Z

    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    return-void
.end method

.method public static isKnownTag(Ljava/lang/String;)Z
    .locals 1

    .line 146
    sget-object v0, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static register(Lorg/jsoup/parser/Tag;)V
    .locals 2

    .line 304
    sget-object v0, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    iget-object v1, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jsoup/parser/Tag;
    .locals 1

    .line 49
    invoke-static {p0}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 50
    sget-object v0, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jsoup/parser/Tag;

    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 54
    invoke-static {p0}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 55
    sget-object v0, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jsoup/parser/Tag;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lorg/jsoup/parser/Tag;

    invoke-direct {v0, p0}, Lorg/jsoup/parser/Tag;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 60
    iput-boolean p0, v0, Lorg/jsoup/parser/Tag;->isBlock:Z

    const/4 p0, 0x1

    .line 61
    iput-boolean p0, v0, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    :cond_0
    return-object v0
.end method


# virtual methods
.method public canContainBlock()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 182
    :cond_0
    instance-of v1, p1, Lorg/jsoup/parser/Tag;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 184
    :cond_1
    check-cast p1, Lorg/jsoup/parser/Tag;

    .line 186
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    if-eq v1, v3, :cond_2

    return v2

    .line 187
    :cond_2
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->canContainInline:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->canContainInline:Z

    if-eq v1, v3, :cond_3

    return v2

    .line 188
    :cond_3
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->empty:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->empty:Z

    if-eq v1, v3, :cond_4

    return v2

    .line 189
    :cond_4
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    if-eq v1, v3, :cond_5

    return v2

    .line 190
    :cond_5
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->isBlock:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->isBlock:Z

    if-eq v1, v3, :cond_6

    return v2

    .line 191
    :cond_6
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->preserveWhitespace:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->preserveWhitespace:Z

    if-eq v1, v3, :cond_7

    return v2

    .line 192
    :cond_7
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->selfClosing:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->selfClosing:Z

    if-eq v1, v3, :cond_8

    return v2

    .line 193
    :cond_8
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->formList:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->formList:Z

    if-eq v1, v3, :cond_9

    return v2

    .line 194
    :cond_9
    iget-boolean v1, p0, Lorg/jsoup/parser/Tag;->formSubmit:Z

    iget-boolean v3, p1, Lorg/jsoup/parser/Tag;->formSubmit:Z

    if-eq v1, v3, :cond_a

    return v2

    .line 195
    :cond_a
    iget-object v1, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    iget-object p1, p1, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public formatAsBlock()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 202
    iget-object v0, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    .line 203
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->isBlock:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 204
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->formatAsBlock:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 205
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->canContainBlock:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 206
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->canContainInline:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 207
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->empty:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 208
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->selfClosing:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 209
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->preserveWhitespace:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 210
    iget-boolean v2, p0, Lorg/jsoup/parser/Tag;->formList:Z

    add-int/2addr v0, v2

    mul-int/2addr v1, v0

    .line 211
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->formSubmit:Z

    add-int/2addr v1, v0

    return v1
.end method

.method public isBlock()Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->isBlock:Z

    return v0
.end method

.method public isData()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->canContainInline:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/jsoup/parser/Tag;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->empty:Z

    return v0
.end method

.method public isFormListed()Z
    .locals 1

    .line 163
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->formList:Z

    return v0
.end method

.method public isFormSubmittable()Z
    .locals 1

    .line 171
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->formSubmit:Z

    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->isBlock:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isKnownTag()Z
    .locals 2

    .line 136
    sget-object v0, Lorg/jsoup/parser/Tag;->tags:Ljava/util/Map;

    iget-object v1, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isSelfClosing()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->empty:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->selfClosing:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public preserveWhitespace()Z
    .locals 1

    .line 155
    iget-boolean v0, p0, Lorg/jsoup/parser/Tag;->preserveWhitespace:Z

    return v0
.end method

.method setSelfClosing()Lorg/jsoup/parser/Tag;
    .locals 1

    const/4 v0, 0x1

    .line 175
    iput-boolean v0, p0, Lorg/jsoup/parser/Tag;->selfClosing:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lorg/jsoup/parser/Tag;->tagName:Ljava/lang/String;

    return-object v0
.end method
