.class public Lcom/ibotta/android/state/app/config/greetings/Greeting;
.super Ljava/lang/Object;
.source "Greeting.java"


# instance fields
.field private greeting:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGreeting()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/Greeting;->greeting:Ljava/lang/String;

    return-object v0
.end method

.method public setGreeting(Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/greetings/Greeting;->greeting:Ljava/lang/String;

    return-void
.end method
