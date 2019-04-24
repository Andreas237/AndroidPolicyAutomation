.class public Lcom/ibotta/tracking/generated/invoker/Pair;
.super Ljava/lang/Object;
.source "Pair.java"


# instance fields
.field private name:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 18
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/Pair;->name:Ljava/lang/String;

    const-string v0, ""

    .line 19
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/Pair;->value:Ljava/lang/String;

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/tracking/generated/invoker/Pair;->setName(Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p2}, Lcom/ibotta/tracking/generated/invoker/Pair;->setValue(Ljava/lang/String;)V

    return-void
.end method

.method private isValidString(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 48
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private setName(Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/tracking/generated/invoker/Pair;->isValidString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/Pair;->name:Ljava/lang/String;

    return-void
.end method

.method private setValue(Ljava/lang/String;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/tracking/generated/invoker/Pair;->isValidString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 35
    :cond_0
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/Pair;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/Pair;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/Pair;->value:Ljava/lang/String;

    return-object v0
.end method
