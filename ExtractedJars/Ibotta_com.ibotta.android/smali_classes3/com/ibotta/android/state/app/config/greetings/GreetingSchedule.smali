.class public Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;
.super Ljava/lang/Object;
.source "GreetingSchedule.java"


# static fields
.field private static DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;


# instance fields
.field private greetings:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dates"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/config/greetings/Greeting;",
            ">;"
        }
    .end annotation
.end field

.field private times:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/greetings/Times;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->greetings:Ljava/util/Map;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->times:Ljava/util/List;

    return-void
.end method

.method public static getDefault(Landroid/content/res/Resources;)Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;
    .locals 4

    .line 23
    sget-object v0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    if-eqz v0, :cond_0

    return-object v0

    .line 27
    :cond_0
    new-instance v0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;-><init>()V

    sput-object v0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    .line 29
    new-instance v0, Lcom/ibotta/android/state/app/config/greetings/Times;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/greetings/Times;-><init>()V

    const-string v1, "12:00 AM"

    .line 30
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/greetings/Times;->setStart(Ljava/lang/String;)V

    const-string v1, "12:00 PM"

    .line 31
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/greetings/Times;->setEnd(Ljava/lang/String;)V

    .line 32
    sget v1, Lcom/ibotta/android/state/R$string;->greeting_morning:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/greetings/Times;->setGreeting(Ljava/lang/String;)V

    .line 34
    new-instance v1, Lcom/ibotta/android/state/app/config/greetings/Times;

    invoke-direct {v1}, Lcom/ibotta/android/state/app/config/greetings/Times;-><init>()V

    const-string v2, "12:01 PM"

    .line 35
    invoke-virtual {v1, v2}, Lcom/ibotta/android/state/app/config/greetings/Times;->setStart(Ljava/lang/String;)V

    const-string v2, "4:00 PM"

    .line 36
    invoke-virtual {v1, v2}, Lcom/ibotta/android/state/app/config/greetings/Times;->setEnd(Ljava/lang/String;)V

    .line 37
    sget v2, Lcom/ibotta/android/state/R$string;->greeting_afternoon:I

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/state/app/config/greetings/Times;->setGreeting(Ljava/lang/String;)V

    .line 39
    new-instance v2, Lcom/ibotta/android/state/app/config/greetings/Times;

    invoke-direct {v2}, Lcom/ibotta/android/state/app/config/greetings/Times;-><init>()V

    const-string v3, "4:01 PM"

    .line 40
    invoke-virtual {v2, v3}, Lcom/ibotta/android/state/app/config/greetings/Times;->setStart(Ljava/lang/String;)V

    const-string v3, "11:59 PM"

    .line 41
    invoke-virtual {v2, v3}, Lcom/ibotta/android/state/app/config/greetings/Times;->setEnd(Ljava/lang/String;)V

    .line 42
    sget v3, Lcom/ibotta/android/state/R$string;->greeting_evening:I

    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/ibotta/android/state/app/config/greetings/Times;->setGreeting(Ljava/lang/String;)V

    .line 44
    sget-object p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->getTimes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    sget-object p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->getTimes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    sget-object p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->getTimes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    sget-object p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->DEFAULT:Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;

    return-object p0
.end method


# virtual methods
.method public getGreetings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/config/greetings/Greeting;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->greetings:Ljava/util/Map;

    return-object v0
.end method

.method public getTimes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/greetings/Times;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->times:Ljava/util/List;

    return-object v0
.end method

.method public setGreetings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/config/greetings/Greeting;",
            ">;)V"
        }
    .end annotation

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->greetings:Ljava/util/Map;

    return-void
.end method

.method public setTimes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/greetings/Times;",
            ">;)V"
        }
    .end annotation

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/greetings/GreetingSchedule;->times:Ljava/util/List;

    return-void
.end method
