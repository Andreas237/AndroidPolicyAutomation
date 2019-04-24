.class Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup;
.super Lorg/apache/commons/lang3/text/StrLookup;
.source "StrLookup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/lang3/text/StrLookup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MapStrLookup"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/apache/commons/lang3/text/StrLookup",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "TV;>;)V"
        }
    .end annotation

    .prologue
    .line 147
    .local p0, "this":Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup;, "Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup<TV;>;"
    .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;TV;>;"
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/StrLookup;-><init>()V

    .line 148
    iput-object p1, p0, Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup;->map:Ljava/util/Map;

    .line 149
    return-void
.end method


# virtual methods
.method public lookup(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup;, "Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup<TV;>;"
    const/4 v1, 0x0

    .line 162
    iget-object v2, p0, Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup;->map:Ljava/util/Map;

    if-nez v2, :cond_1

    .line 169
    :cond_0
    :goto_0
    return-object v1

    .line 165
    :cond_1
    iget-object v2, p0, Lorg/apache/commons/lang3/text/StrLookup$MapStrLookup;->map:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 166
    .local v0, "obj":Ljava/lang/Object;
    if-eqz v0, :cond_0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
