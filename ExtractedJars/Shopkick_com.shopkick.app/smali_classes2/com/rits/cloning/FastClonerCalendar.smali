.class public Lcom/rits/cloning/FastClonerCalendar;
.super Ljava/lang/Object;
.source "FastClonerCalendar.java"

# interfaces
.implements Lcom/rits/cloning/IFastCloner;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone(Ljava/lang/Object;Lcom/rits/cloning/Cloner;Ljava/util/Map;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/rits/cloning/Cloner;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 15
    new-instance p2, Ljava/util/GregorianCalendar;

    invoke-direct {p2}, Ljava/util/GregorianCalendar;-><init>()V

    .line 16
    check-cast p1, Ljava/util/GregorianCalendar;

    invoke-virtual {p1}, Ljava/util/GregorianCalendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/util/GregorianCalendar;->setTimeInMillis(J)V

    return-object p2
.end method
