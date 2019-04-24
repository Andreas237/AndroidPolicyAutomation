.class Lcom/stripe/android/Stripe$1;
.super Ljava/lang/Object;
.source "Stripe.java"

# interfaces
.implements Lcom/stripe/android/Stripe$SourceCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/Stripe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/Stripe;


# direct methods
.method constructor <init>(Lcom/stripe/android/Stripe;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/stripe/android/Stripe$1;->this$0:Lcom/stripe/android/Stripe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/stripe/android/SourceCallback;)V
    .locals 7
    .param p1    # Lcom/stripe/android/model/SourceParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/SourceCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 47
    new-instance v6, Lcom/stripe/android/Stripe$1$1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/Stripe$1$1;-><init>(Lcom/stripe/android/Stripe$1;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/SourceCallback;)V

    .line 75
    iget-object p1, p0, Lcom/stripe/android/Stripe$1;->this$0:Lcom/stripe/android/Stripe;

    invoke-static {p1, p4, v6}, Lcom/stripe/android/Stripe;->access$300(Lcom/stripe/android/Stripe;Ljava/util/concurrent/Executor;Landroid/os/AsyncTask;)V

    return-void
.end method
