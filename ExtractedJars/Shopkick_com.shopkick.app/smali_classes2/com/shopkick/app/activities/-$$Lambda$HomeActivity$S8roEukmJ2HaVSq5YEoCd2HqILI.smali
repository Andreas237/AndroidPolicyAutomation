.class public final synthetic Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/activities/HomeActivity;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/activities/HomeActivity;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;->f$0:Lcom/shopkick/app/activities/HomeActivity;

    iput-boolean p2, p0, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;->f$0:Lcom/shopkick/app/activities/HomeActivity;

    iget-boolean v1, p0, Lcom/shopkick/app/activities/-$$Lambda$HomeActivity$S8roEukmJ2HaVSq5YEoCd2HqILI;->f$1:Z

    invoke-static {v0, v1}, Lcom/shopkick/app/activities/HomeActivity;->lambda$updateNotificationBellIcon$15(Lcom/shopkick/app/activities/HomeActivity;Z)V

    return-void
.end method
