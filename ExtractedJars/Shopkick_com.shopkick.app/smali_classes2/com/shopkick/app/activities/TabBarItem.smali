.class public Lcom/shopkick/app/activities/TabBarItem;
.super Ljava/lang/Object;
.source "TabBarItem.java"


# instance fields
.field public rootClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field public tabContextName:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lcom/shopkick/app/activities/TabBarItem;->rootClass:Ljava/lang/Class;

    .line 14
    iput-object p3, p0, Lcom/shopkick/app/activities/TabBarItem;->title:Ljava/lang/String;

    return-void
.end method
