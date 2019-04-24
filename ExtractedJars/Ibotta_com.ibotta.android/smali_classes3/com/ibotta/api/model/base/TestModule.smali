.class public final Lcom/ibotta/api/model/base/TestModule;
.super Lcom/ibotta/api/model/base/Module;
.source "TestModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/model/base/Module;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 12
    instance-of v0, p1, Lcom/ibotta/api/model/base/Module;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/api/model/base/Module;

    .line 13
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/api/model/base/TestModule;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ibotta/api/model/base/TestModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
