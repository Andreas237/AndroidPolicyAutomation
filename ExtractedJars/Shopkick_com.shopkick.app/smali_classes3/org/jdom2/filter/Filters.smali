.class public final Lorg/jdom2/filter/Filters;
.super Ljava/lang/Object;
.source "Filters.java"


# static fields
.field private static final fattribute:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation
.end field

.field private static final fboolean:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final fcdata:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/CDATA;",
            ">;"
        }
    .end annotation
.end field

.field private static final fcomment:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Comment;",
            ">;"
        }
    .end annotation
.end field

.field private static final fcontent:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field

.field private static final fdoctype:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/DocType;",
            ">;"
        }
    .end annotation
.end field

.field private static final fdocument:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Document;",
            ">;"
        }
    .end annotation
.end field

.field private static final fdouble:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private static final felement:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation
.end field

.field private static final fentityref:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/EntityRef;",
            ">;"
        }
    .end annotation
.end field

.field private static final fpassthrough:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final fpi:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/ProcessingInstruction;",
            ">;"
        }
    .end annotation
.end field

.field private static final fstring:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final ftext:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Text;",
            ">;"
        }
    .end annotation
.end field

.field private static final ftextonly:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Text;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 88
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/Content;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fcontent:Lorg/jdom2/filter/Filter;

    .line 91
    new-instance v0, Lorg/jdom2/filter/AttributeFilter;

    invoke-direct {v0}, Lorg/jdom2/filter/AttributeFilter;-><init>()V

    sput-object v0, Lorg/jdom2/filter/Filters;->fattribute:Lorg/jdom2/filter/Filter;

    .line 94
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/Comment;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fcomment:Lorg/jdom2/filter/Filter;

    .line 97
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/CDATA;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fcdata:Lorg/jdom2/filter/Filter;

    .line 100
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/DocType;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fdoctype:Lorg/jdom2/filter/Filter;

    .line 103
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/EntityRef;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fentityref:Lorg/jdom2/filter/Filter;

    .line 106
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/ProcessingInstruction;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fpi:Lorg/jdom2/filter/Filter;

    .line 109
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/Text;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->ftext:Lorg/jdom2/filter/Filter;

    .line 112
    new-instance v0, Lorg/jdom2/filter/TextOnlyFilter;

    invoke-direct {v0}, Lorg/jdom2/filter/TextOnlyFilter;-><init>()V

    sput-object v0, Lorg/jdom2/filter/Filters;->ftextonly:Lorg/jdom2/filter/Filter;

    .line 114
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/Element;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->felement:Lorg/jdom2/filter/Filter;

    .line 117
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Lorg/jdom2/Document;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fdocument:Lorg/jdom2/filter/Filter;

    .line 120
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Ljava/lang/Double;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fdouble:Lorg/jdom2/filter/Filter;

    .line 123
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fboolean:Lorg/jdom2/filter/Filter;

    .line 126
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    const-class v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lorg/jdom2/filter/Filters;->fstring:Lorg/jdom2/filter/Filter;

    .line 129
    new-instance v0, Lorg/jdom2/filter/PassThroughFilter;

    invoke-direct {v0}, Lorg/jdom2/filter/PassThroughFilter;-><init>()V

    sput-object v0, Lorg/jdom2/filter/Filters;->fpassthrough:Lorg/jdom2/filter/Filter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final attribute()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation

    .line 152
    sget-object v0, Lorg/jdom2/filter/Filters;->fattribute:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final attribute(Ljava/lang/String;)Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation

    .line 165
    new-instance v0, Lorg/jdom2/filter/AttributeFilter;

    invoke-direct {v0, p0}, Lorg/jdom2/filter/AttributeFilter;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final attribute(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/jdom2/Namespace;",
            ")",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation

    .line 178
    new-instance v0, Lorg/jdom2/filter/AttributeFilter;

    invoke-direct {v0, p0, p1}, Lorg/jdom2/filter/AttributeFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public static final attribute(Lorg/jdom2/Namespace;)Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Namespace;",
            ")",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation

    .line 190
    new-instance v0, Lorg/jdom2/filter/AttributeFilter;

    invoke-direct {v0, p0}, Lorg/jdom2/filter/AttributeFilter;-><init>(Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public static final cdata()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/CDATA;",
            ">;"
        }
    .end annotation

    .line 208
    sget-object v0, Lorg/jdom2/filter/Filters;->fcdata:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final comment()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Comment;",
            ">;"
        }
    .end annotation

    .line 199
    sget-object v0, Lorg/jdom2/filter/Filters;->fcomment:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final content()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 143
    sget-object v0, Lorg/jdom2/filter/Filters;->fcontent:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final doctype()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/DocType;",
            ">;"
        }
    .end annotation

    .line 217
    sget-object v0, Lorg/jdom2/filter/Filters;->fdoctype:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final document()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Document;",
            ">;"
        }
    .end annotation

    .line 244
    sget-object v0, Lorg/jdom2/filter/Filters;->fdocument:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final element()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 235
    sget-object v0, Lorg/jdom2/filter/Filters;->felement:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final element(Ljava/lang/String;)Lorg/jdom2/filter/Filter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 256
    new-instance v0, Lorg/jdom2/filter/ElementFilter;

    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-direct {v0, p0, v1}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public static final element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/jdom2/Namespace;",
            ")",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 269
    new-instance v0, Lorg/jdom2/filter/ElementFilter;

    invoke-direct {v0, p0, p1}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public static final element(Lorg/jdom2/Namespace;)Lorg/jdom2/filter/Filter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Namespace;",
            ")",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Element;",
            ">;"
        }
    .end annotation

    .line 281
    new-instance v0, Lorg/jdom2/filter/ElementFilter;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lorg/jdom2/filter/ElementFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public static final entityref()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/EntityRef;",
            ">;"
        }
    .end annotation

    .line 226
    sget-object v0, Lorg/jdom2/filter/Filters;->fentityref:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final fboolean()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 321
    sget-object v0, Lorg/jdom2/filter/Filters;->fboolean:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final fclass(Ljava/lang/Class;)Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TF;>;)",
            "Lorg/jdom2/filter/Filter<",
            "TF;>;"
        }
    .end annotation

    .line 350
    new-instance v0, Lorg/jdom2/filter/ClassFilter;

    invoke-direct {v0, p0}, Lorg/jdom2/filter/ClassFilter;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public static final fdouble()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 339
    sget-object v0, Lorg/jdom2/filter/Filters;->fdouble:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final fpassthrough()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 358
    sget-object v0, Lorg/jdom2/filter/Filters;->fpassthrough:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final fstring()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 330
    sget-object v0, Lorg/jdom2/filter/Filters;->fstring:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final processinginstruction()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/ProcessingInstruction;",
            ">;"
        }
    .end annotation

    .line 290
    sget-object v0, Lorg/jdom2/filter/Filters;->fpi:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final text()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Text;",
            ">;"
        }
    .end annotation

    .line 301
    sget-object v0, Lorg/jdom2/filter/Filters;->ftext:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public static final textOnly()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "Lorg/jdom2/Text;",
            ">;"
        }
    .end annotation

    .line 312
    sget-object v0, Lorg/jdom2/filter/Filters;->ftextonly:Lorg/jdom2/filter/Filter;

    return-object v0
.end method
