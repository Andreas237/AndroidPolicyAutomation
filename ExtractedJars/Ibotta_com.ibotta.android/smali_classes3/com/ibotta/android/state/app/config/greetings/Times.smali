.class public Lcom/ibotta/android/state/app/config/greetings/Times;
.super Ljava/lang/Object;
.source "Times.java"


# instance fields
.field private end:Ljava/lang/String;

.field private greeting:Ljava/lang/String;

.field private start:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEnd()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/Times;->end:Ljava/lang/String;

    return-object v0
.end method

.method public getGreeting()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/Times;->greeting:Ljava/lang/String;

    return-object v0
.end method

.method public getStart()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/Times;->start:Ljava/lang/String;

    return-object v0
.end method

.method public setEnd(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/greetings/Times;->end:Ljava/lang/String;

    return-void
.end method

.method public setGreeting(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/greetings/Times;->greeting:Ljava/lang/String;

    return-void
.end method

.method public setStart(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/greetings/Times;->start:Ljava/lang/String;

    return-void
.end method
