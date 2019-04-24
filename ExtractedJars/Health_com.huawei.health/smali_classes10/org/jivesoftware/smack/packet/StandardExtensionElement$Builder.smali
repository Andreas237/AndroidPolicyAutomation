.class public final Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/StandardExtensionElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private elements:Lorg/jivesoftware/smack/util/MultiMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/util/MultiMap<Ljava/lang/String;Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final namespace:Ljava/lang/String;

.field private text:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->name:Ljava/lang/String;

    .line 175
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->namespace:Ljava/lang/String;

    .line 176
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/StandardExtensionElement$1;)V
    .locals 0

    .line 165
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public addAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    .locals 1

    .line 179
    const-string v0, "Attribute name must be set"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 180
    const-string v0, "Attribute value must be not null"

    invoke-static {p2, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 181
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    .line 184
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    return-object p0
.end method

.method public addAttributes(Ljava/util/Map;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 190
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    .line 192
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 193
    return-object p0
.end method

.method public addElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    .locals 2

    .line 212
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->namespace:Ljava/lang/String;

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->builder(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->setText(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    move-result-object v0

    .line 213
    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->build()Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    move-result-object v1

    .line 214
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->addElement(Lorg/jivesoftware/smack/packet/StandardExtensionElement;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addElement(Lorg/jivesoftware/smack/packet/StandardExtensionElement;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    .locals 3

    .line 202
    const-string v0, "Element must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    if-nez v0, :cond_0

    .line 204
    new-instance v0, Lorg/jivesoftware/smack/util/MultiMap;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/MultiMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    .line 206
    :cond_0
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 207
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v2, p1}, Lorg/jivesoftware/smack/util/MultiMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    return-object p0
.end method

.method public build()Lorg/jivesoftware/smack/packet/StandardExtensionElement;
    .locals 7

    .line 218
    new-instance v0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->name:Ljava/lang/String;

    iget-object v2, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->namespace:Ljava/lang/String;

    iget-object v3, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->attributes:Ljava/util/Map;

    iget-object v4, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->text:Ljava/lang/String;

    iget-object v5, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/jivesoftware/smack/util/MultiMap;Lorg/jivesoftware/smack/packet/StandardExtensionElement$1;)V

    return-object v0
.end method

.method public setText(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    .locals 1

    .line 197
    const-string v0, "Text must be not null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->text:Ljava/lang/String;

    .line 198
    return-object p0
.end method
