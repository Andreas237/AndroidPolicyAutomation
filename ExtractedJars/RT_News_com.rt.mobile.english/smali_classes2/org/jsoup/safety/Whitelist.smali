.class public Lorg/jsoup/safety/Whitelist;
.super Ljava/lang/Object;
.source "Whitelist.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jsoup/safety/Whitelist$TypedValue;,
        Lorg/jsoup/safety/Whitelist$Protocol;,
        Lorg/jsoup/safety/Whitelist$AttributeValue;,
        Lorg/jsoup/safety/Whitelist$AttributeKey;,
        Lorg/jsoup/safety/Whitelist$TagName;
    }
.end annotation


# instance fields
.field private attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/jsoup/safety/Whitelist$TagName;",
            "Ljava/util/Set<",
            "Lorg/jsoup/safety/Whitelist$AttributeKey;",
            ">;>;"
        }
    .end annotation
.end field

.field private enforcedAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/jsoup/safety/Whitelist$TagName;",
            "Ljava/util/Map<",
            "Lorg/jsoup/safety/Whitelist$AttributeKey;",
            "Lorg/jsoup/safety/Whitelist$AttributeValue;",
            ">;>;"
        }
    .end annotation
.end field

.field private preserveRelativeLinks:Z

.field private protocols:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/jsoup/safety/Whitelist$TagName;",
            "Ljava/util/Map<",
            "Lorg/jsoup/safety/Whitelist$AttributeKey;",
            "Ljava/util/Set<",
            "Lorg/jsoup/safety/Whitelist$Protocol;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private tagNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/jsoup/safety/Whitelist$TagName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    .line 173
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jsoup/safety/Whitelist;->attributes:Ljava/util/Map;

    .line 174
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jsoup/safety/Whitelist;->enforcedAttributes:Ljava/util/Map;

    .line 175
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jsoup/safety/Whitelist;->protocols:Ljava/util/Map;

    const/4 v0, 0x0

    .line 176
    iput-boolean v0, p0, Lorg/jsoup/safety/Whitelist;->preserveRelativeLinks:Z

    return-void
.end method

.method public static basic()Lorg/jsoup/safety/Whitelist;
    .locals 9

    .line 90
    new-instance v0, Lorg/jsoup/safety/Whitelist;

    invoke-direct {v0}, Lorg/jsoup/safety/Whitelist;-><init>()V

    const/16 v1, 0x18

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "b"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "blockquote"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "br"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "cite"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "code"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "dd"

    const/4 v8, 0x6

    aput-object v2, v1, v8

    const-string v2, "dl"

    const/4 v8, 0x7

    aput-object v2, v1, v8

    const-string v2, "dt"

    const/16 v8, 0x8

    aput-object v2, v1, v8

    const-string v2, "em"

    const/16 v8, 0x9

    aput-object v2, v1, v8

    const-string v2, "i"

    const/16 v8, 0xa

    aput-object v2, v1, v8

    const-string v2, "li"

    const/16 v8, 0xb

    aput-object v2, v1, v8

    const-string v2, "ol"

    const/16 v8, 0xc

    aput-object v2, v1, v8

    const-string v2, "p"

    const/16 v8, 0xd

    aput-object v2, v1, v8

    const-string v2, "pre"

    const/16 v8, 0xe

    aput-object v2, v1, v8

    const-string v2, "q"

    const/16 v8, 0xf

    aput-object v2, v1, v8

    const-string v2, "small"

    const/16 v8, 0x10

    aput-object v2, v1, v8

    const-string v2, "span"

    const/16 v8, 0x11

    aput-object v2, v1, v8

    const-string v2, "strike"

    const/16 v8, 0x12

    aput-object v2, v1, v8

    const-string v2, "strong"

    const/16 v8, 0x13

    aput-object v2, v1, v8

    const-string v2, "sub"

    const/16 v8, 0x14

    aput-object v2, v1, v8

    const-string v2, "sup"

    const/16 v8, 0x15

    aput-object v2, v1, v8

    const-string v2, "u"

    const/16 v8, 0x16

    aput-object v2, v1, v8

    const-string v2, "ul"

    const/16 v8, 0x17

    aput-object v2, v1, v8

    invoke-virtual {v0, v1}, Lorg/jsoup/safety/Whitelist;->addTags([Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "a"

    new-array v2, v4, [Ljava/lang/String;

    const-string v8, "href"

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "blockquote"

    new-array v2, v4, [Ljava/lang/String;

    const-string v8, "cite"

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "q"

    new-array v2, v4, [Ljava/lang/String;

    const-string v8, "cite"

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "a"

    const-string v2, "href"

    new-array v7, v7, [Ljava/lang/String;

    const-string v8, "ftp"

    aput-object v8, v7, v3

    const-string v8, "http"

    aput-object v8, v7, v4

    const-string v8, "https"

    aput-object v8, v7, v5

    const-string v8, "mailto"

    aput-object v8, v7, v6

    invoke-virtual {v0, v1, v2, v7}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "blockquote"

    const-string v2, "cite"

    new-array v6, v5, [Ljava/lang/String;

    const-string v7, "http"

    aput-object v7, v6, v3

    const-string v7, "https"

    aput-object v7, v6, v4

    invoke-virtual {v0, v1, v2, v6}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "cite"

    const-string v2, "cite"

    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "http"

    aput-object v6, v5, v3

    const-string v3, "https"

    aput-object v3, v5, v4

    invoke-virtual {v0, v1, v2, v5}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "a"

    const-string v2, "rel"

    const-string v3, "nofollow"

    invoke-virtual {v0, v1, v2, v3}, Lorg/jsoup/safety/Whitelist;->addEnforcedAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    return-object v0
.end method

.method public static basicWithImages()Lorg/jsoup/safety/Whitelist;
    .locals 8

    .line 116
    invoke-static {}, Lorg/jsoup/safety/Whitelist;->basic()Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "img"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v2}, Lorg/jsoup/safety/Whitelist;->addTags([Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v2, "img"

    const/4 v3, 0x6

    new-array v3, v3, [Ljava/lang/String;

    const-string v5, "align"

    aput-object v5, v3, v4

    const-string v5, "alt"

    aput-object v5, v3, v1

    const-string v5, "height"

    const/4 v6, 0x2

    aput-object v5, v3, v6

    const-string v5, "src"

    const/4 v7, 0x3

    aput-object v5, v3, v7

    const-string v5, "title"

    const/4 v7, 0x4

    aput-object v5, v3, v7

    const-string v5, "width"

    const/4 v7, 0x5

    aput-object v5, v3, v7

    invoke-virtual {v0, v2, v3}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v2, "img"

    const-string v3, "src"

    new-array v5, v6, [Ljava/lang/String;

    const-string v6, "http"

    aput-object v6, v5, v4

    const-string v4, "https"

    aput-object v4, v5, v1

    invoke-virtual {v0, v2, v3, v5}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    return-object v0
.end method

.method public static none()Lorg/jsoup/safety/Whitelist;
    .locals 1

    .line 63
    new-instance v0, Lorg/jsoup/safety/Whitelist;

    invoke-direct {v0}, Lorg/jsoup/safety/Whitelist;-><init>()V

    return-object v0
.end method

.method public static relaxed()Lorg/jsoup/safety/Whitelist;
    .locals 11

    .line 133
    new-instance v0, Lorg/jsoup/safety/Whitelist;

    invoke-direct {v0}, Lorg/jsoup/safety/Whitelist;-><init>()V

    const/16 v1, 0x2a

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "b"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "blockquote"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "br"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "caption"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "cite"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "code"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    const-string v2, "col"

    const/4 v10, 0x7

    aput-object v2, v1, v10

    const-string v2, "colgroup"

    const/16 v10, 0x8

    aput-object v2, v1, v10

    const-string v2, "dd"

    const/16 v10, 0x9

    aput-object v2, v1, v10

    const-string v2, "div"

    const/16 v10, 0xa

    aput-object v2, v1, v10

    const-string v2, "dl"

    const/16 v10, 0xb

    aput-object v2, v1, v10

    const-string v2, "dt"

    const/16 v10, 0xc

    aput-object v2, v1, v10

    const-string v2, "em"

    const/16 v10, 0xd

    aput-object v2, v1, v10

    const-string v2, "h1"

    const/16 v10, 0xe

    aput-object v2, v1, v10

    const-string v2, "h2"

    const/16 v10, 0xf

    aput-object v2, v1, v10

    const-string v2, "h3"

    const/16 v10, 0x10

    aput-object v2, v1, v10

    const-string v2, "h4"

    const/16 v10, 0x11

    aput-object v2, v1, v10

    const-string v2, "h5"

    const/16 v10, 0x12

    aput-object v2, v1, v10

    const-string v2, "h6"

    const/16 v10, 0x13

    aput-object v2, v1, v10

    const-string v2, "i"

    const/16 v10, 0x14

    aput-object v2, v1, v10

    const-string v2, "img"

    const/16 v10, 0x15

    aput-object v2, v1, v10

    const-string v2, "li"

    const/16 v10, 0x16

    aput-object v2, v1, v10

    const-string v2, "ol"

    const/16 v10, 0x17

    aput-object v2, v1, v10

    const-string v2, "p"

    const/16 v10, 0x18

    aput-object v2, v1, v10

    const-string v2, "pre"

    const/16 v10, 0x19

    aput-object v2, v1, v10

    const-string v2, "q"

    const/16 v10, 0x1a

    aput-object v2, v1, v10

    const-string v2, "small"

    const/16 v10, 0x1b

    aput-object v2, v1, v10

    const-string v2, "span"

    const/16 v10, 0x1c

    aput-object v2, v1, v10

    const-string v2, "strike"

    const/16 v10, 0x1d

    aput-object v2, v1, v10

    const-string v2, "strong"

    const/16 v10, 0x1e

    aput-object v2, v1, v10

    const-string v2, "sub"

    const/16 v10, 0x1f

    aput-object v2, v1, v10

    const-string v2, "sup"

    const/16 v10, 0x20

    aput-object v2, v1, v10

    const-string v2, "table"

    const/16 v10, 0x21

    aput-object v2, v1, v10

    const-string v2, "tbody"

    const/16 v10, 0x22

    aput-object v2, v1, v10

    const-string v2, "td"

    const/16 v10, 0x23

    aput-object v2, v1, v10

    const-string v2, "tfoot"

    const/16 v10, 0x24

    aput-object v2, v1, v10

    const-string v2, "th"

    const/16 v10, 0x25

    aput-object v2, v1, v10

    const-string v2, "thead"

    const/16 v10, 0x26

    aput-object v2, v1, v10

    const-string v2, "tr"

    const/16 v10, 0x27

    aput-object v2, v1, v10

    const-string v2, "u"

    const/16 v10, 0x28

    aput-object v2, v1, v10

    const-string v2, "ul"

    const/16 v10, 0x29

    aput-object v2, v1, v10

    invoke-virtual {v0, v1}, Lorg/jsoup/safety/Whitelist;->addTags([Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "a"

    new-array v2, v5, [Ljava/lang/String;

    const-string v10, "href"

    aput-object v10, v2, v3

    const-string v10, "title"

    aput-object v10, v2, v4

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "blockquote"

    new-array v2, v4, [Ljava/lang/String;

    const-string v10, "cite"

    aput-object v10, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "col"

    new-array v2, v5, [Ljava/lang/String;

    const-string v10, "span"

    aput-object v10, v2, v3

    const-string v10, "width"

    aput-object v10, v2, v4

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "colgroup"

    new-array v2, v5, [Ljava/lang/String;

    const-string v10, "span"

    aput-object v10, v2, v3

    const-string v10, "width"

    aput-object v10, v2, v4

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "img"

    new-array v2, v9, [Ljava/lang/String;

    const-string v10, "align"

    aput-object v10, v2, v3

    const-string v10, "alt"

    aput-object v10, v2, v4

    const-string v10, "height"

    aput-object v10, v2, v5

    const-string v10, "src"

    aput-object v10, v2, v6

    const-string v10, "title"

    aput-object v10, v2, v7

    const-string v10, "width"

    aput-object v10, v2, v8

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "ol"

    new-array v2, v5, [Ljava/lang/String;

    const-string v10, "start"

    aput-object v10, v2, v3

    const-string v10, "type"

    aput-object v10, v2, v4

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "q"

    new-array v2, v4, [Ljava/lang/String;

    const-string v10, "cite"

    aput-object v10, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "table"

    new-array v2, v5, [Ljava/lang/String;

    const-string v10, "summary"

    aput-object v10, v2, v3

    const-string v10, "width"

    aput-object v10, v2, v4

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "td"

    new-array v2, v8, [Ljava/lang/String;

    const-string v10, "abbr"

    aput-object v10, v2, v3

    const-string v10, "axis"

    aput-object v10, v2, v4

    const-string v10, "colspan"

    aput-object v10, v2, v5

    const-string v10, "rowspan"

    aput-object v10, v2, v6

    const-string v10, "width"

    aput-object v10, v2, v7

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "th"

    new-array v2, v9, [Ljava/lang/String;

    const-string v9, "abbr"

    aput-object v9, v2, v3

    const-string v9, "axis"

    aput-object v9, v2, v4

    const-string v9, "colspan"

    aput-object v9, v2, v5

    const-string v9, "rowspan"

    aput-object v9, v2, v6

    const-string v9, "scope"

    aput-object v9, v2, v7

    const-string v9, "width"

    aput-object v9, v2, v8

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "ul"

    new-array v2, v4, [Ljava/lang/String;

    const-string v8, "type"

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/jsoup/safety/Whitelist;->addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "a"

    const-string v2, "href"

    new-array v7, v7, [Ljava/lang/String;

    const-string v8, "ftp"

    aput-object v8, v7, v3

    const-string v8, "http"

    aput-object v8, v7, v4

    const-string v8, "https"

    aput-object v8, v7, v5

    const-string v8, "mailto"

    aput-object v8, v7, v6

    invoke-virtual {v0, v1, v2, v7}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "blockquote"

    const-string v2, "cite"

    new-array v6, v5, [Ljava/lang/String;

    const-string v7, "http"

    aput-object v7, v6, v3

    const-string v7, "https"

    aput-object v7, v6, v4

    invoke-virtual {v0, v1, v2, v6}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "cite"

    const-string v2, "cite"

    new-array v6, v5, [Ljava/lang/String;

    const-string v7, "http"

    aput-object v7, v6, v3

    const-string v7, "https"

    aput-object v7, v6, v4

    invoke-virtual {v0, v1, v2, v6}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "img"

    const-string v2, "src"

    new-array v6, v5, [Ljava/lang/String;

    const-string v7, "http"

    aput-object v7, v6, v3

    const-string v7, "https"

    aput-object v7, v6, v4

    invoke-virtual {v0, v1, v2, v6}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    const-string v1, "q"

    const-string v2, "cite"

    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "http"

    aput-object v6, v5, v3

    const-string v3, "https"

    aput-object v3, v5, v4

    invoke-virtual {v0, v1, v2, v5}, Lorg/jsoup/safety/Whitelist;->addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    return-object v0
.end method

.method public static simpleText()Lorg/jsoup/safety/Whitelist;
    .locals 4

    .line 73
    new-instance v0, Lorg/jsoup/safety/Whitelist;

    invoke-direct {v0}, Lorg/jsoup/safety/Whitelist;-><init>()V

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "em"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "i"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "strong"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "u"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lorg/jsoup/safety/Whitelist;->addTags([Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;

    move-result-object v0

    return-object v0
.end method

.method private testValidProtocol(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Attribute;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jsoup/nodes/Element;",
            "Lorg/jsoup/nodes/Attribute;",
            "Ljava/util/Set<",
            "Lorg/jsoup/safety/Whitelist$Protocol;",
            ">;)Z"
        }
    .end annotation

    .line 361
    invoke-virtual {p2}, Lorg/jsoup/nodes/Attribute;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/jsoup/nodes/Element;->absUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 362
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 363
    invoke-virtual {p2}, Lorg/jsoup/nodes/Attribute;->getValue()Ljava/lang/String;

    move-result-object p1

    .line 364
    :cond_0
    iget-boolean v0, p0, Lorg/jsoup/safety/Whitelist;->preserveRelativeLinks:Z

    if-nez v0, :cond_1

    .line 365
    invoke-virtual {p2, p1}, Lorg/jsoup/nodes/Attribute;->setValue(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    :cond_1
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/jsoup/safety/Whitelist$Protocol;

    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lorg/jsoup/safety/Whitelist$Protocol;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ":"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 369
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public varargs addAttributes(Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;
    .locals 4

    .line 209
    invoke-static {p1}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 210
    invoke-static {p2}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 211
    array-length v1, p2

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const-string v2, "No attributes supplied."

    invoke-static {v1, v2}, Lorg/jsoup/helper/Validate;->isTrue(ZLjava/lang/String;)V

    .line 213
    invoke-static {p1}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object p1

    .line 214
    iget-object v1, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 215
    iget-object v1, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 216
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 217
    array-length v2, p2

    :goto_1
    if-ge v0, v2, :cond_2

    aget-object v3, p2, v0

    .line 218
    invoke-static {v3}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 219
    invoke-static {v3}, Lorg/jsoup/safety/Whitelist$AttributeKey;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$AttributeKey;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 221
    :cond_2
    iget-object p2, p0, Lorg/jsoup/safety/Whitelist;->attributes:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 222
    iget-object p2, p0, Lorg/jsoup/safety/Whitelist;->attributes:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 223
    invoke-interface {p1, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 225
    :cond_3
    iget-object p2, p0, Lorg/jsoup/safety/Whitelist;->attributes:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-object p0
.end method

.method public addEnforcedAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;
    .locals 1

    .line 243
    invoke-static {p1}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 244
    invoke-static {p2}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 245
    invoke-static {p3}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 247
    invoke-static {p1}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object p1

    .line 248
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 250
    :cond_0
    invoke-static {p2}, Lorg/jsoup/safety/Whitelist$AttributeKey;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$AttributeKey;

    move-result-object p2

    .line 251
    invoke-static {p3}, Lorg/jsoup/safety/Whitelist$AttributeValue;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$AttributeValue;

    move-result-object p3

    .line 253
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->enforcedAttributes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 254
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->enforcedAttributes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 256
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 257
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    iget-object p2, p0, Lorg/jsoup/safety/Whitelist;->enforcedAttributes:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-object p0
.end method

.method public varargs addProtocols(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;
    .locals 2

    .line 294
    invoke-static {p1}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 295
    invoke-static {p2}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 296
    invoke-static {p3}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    .line 298
    invoke-static {p1}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object p1

    .line 299
    invoke-static {p2}, Lorg/jsoup/safety/Whitelist$AttributeKey;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$AttributeKey;

    move-result-object p2

    .line 303
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->protocols:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->protocols:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    goto :goto_0

    .line 306
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 307
    iget-object v1, p0, Lorg/jsoup/safety/Whitelist;->protocols:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    .line 309
    :goto_0
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 310
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    goto :goto_1

    .line 312
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 313
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    .line 315
    :goto_1
    array-length p2, p3

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_2

    aget-object v1, p3, v0

    .line 316
    invoke-static {v1}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 317
    invoke-static {v1}, Lorg/jsoup/safety/Whitelist$Protocol;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$Protocol;

    move-result-object v1

    .line 318
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-object p0
.end method

.method public varargs addTags([Ljava/lang/String;)Lorg/jsoup/safety/Whitelist;
    .locals 4

    .line 186
    invoke-static {p1}, Lorg/jsoup/helper/Validate;->notNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 188
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 189
    invoke-static {v2}, Lorg/jsoup/helper/Validate;->notEmpty(Ljava/lang/String;)V

    .line 190
    iget-object v3, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    invoke-static {v2}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method getEnforcedAttributes(Ljava/lang/String;)Lorg/jsoup/nodes/Attributes;
    .locals 3

    .line 377
    new-instance v0, Lorg/jsoup/nodes/Attributes;

    invoke-direct {v0}, Lorg/jsoup/nodes/Attributes;-><init>()V

    .line 378
    invoke-static {p1}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object p1

    .line 379
    iget-object v1, p0, Lorg/jsoup/safety/Whitelist;->enforcedAttributes:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 380
    iget-object v1, p0, Lorg/jsoup/safety/Whitelist;->enforcedAttributes:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 381
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 382
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jsoup/safety/Whitelist$AttributeKey;

    invoke-virtual {v2}, Lorg/jsoup/safety/Whitelist$AttributeKey;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jsoup/safety/Whitelist$AttributeValue;

    invoke-virtual {v1}, Lorg/jsoup/safety/Whitelist$AttributeValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/jsoup/nodes/Attributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected isSafeAttribute(Ljava/lang/String;Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Attribute;)Z
    .locals 5

    .line 340
    invoke-static {p1}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object v0

    .line 341
    invoke-virtual {p3}, Lorg/jsoup/nodes/Attribute;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/jsoup/safety/Whitelist$AttributeKey;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$AttributeKey;

    move-result-object v1

    .line 343
    iget-object v2, p0, Lorg/jsoup/safety/Whitelist;->attributes:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    .line 344
    iget-object v2, p0, Lorg/jsoup/safety/Whitelist;->attributes:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 345
    iget-object p1, p0, Lorg/jsoup/safety/Whitelist;->protocols:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 346
    iget-object p1, p0, Lorg/jsoup/safety/Whitelist;->protocols:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 348
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-direct {p0, p2, p3, p1}, Lorg/jsoup/safety/Whitelist;->testValidProtocol(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Attribute;Ljava/util/Set;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    move v3, v4

    :cond_1
    return v3

    :cond_2
    return v4

    :cond_3
    const-string v0, ":all"

    .line 355
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, ":all"

    invoke-virtual {p0, p1, p2, p3}, Lorg/jsoup/safety/Whitelist;->isSafeAttribute(Ljava/lang/String;Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Attribute;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v3, v4

    :cond_4
    return v3
.end method

.method protected isSafeTag(Ljava/lang/String;)Z
    .locals 1

    .line 329
    iget-object v0, p0, Lorg/jsoup/safety/Whitelist;->tagNames:Ljava/util/Set;

    invoke-static {p1}, Lorg/jsoup/safety/Whitelist$TagName;->valueOf(Ljava/lang/String;)Lorg/jsoup/safety/Whitelist$TagName;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public preserveRelativeLinks(Z)Lorg/jsoup/safety/Whitelist;
    .locals 0

    .line 278
    iput-boolean p1, p0, Lorg/jsoup/safety/Whitelist;->preserveRelativeLinks:Z

    return-object p0
.end method
