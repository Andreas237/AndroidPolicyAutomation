.class public final synthetic Lcom/shopkick/app/kicksCenter/-$$Lambda$G5jL9kmaoLc57QHR1MSJytb-UQM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/kicksCenter/KicksCenterScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/-$$Lambda$G5jL9kmaoLc57QHR1MSJytb-UQM;->f$0:Lcom/shopkick/app/kicksCenter/KicksCenterScreen;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/-$$Lambda$G5jL9kmaoLc57QHR1MSJytb-UQM;->f$0:Lcom/shopkick/app/kicksCenter/KicksCenterScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->displayToast()V

    return-void
.end method
