.class Lcom/stripe/android/Stripe$2;
.super Ljava/lang/Object;
.source "Stripe.java"

# interfaces
.implements Lcom/stripe/android/Stripe$TokenCreator;


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

    .line 80
    iput-object p1, p0, Lcom/stripe/android/Stripe$2;->this$0:Lcom/stripe/android/Stripe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/stripe/android/TokenCallback;)V
    .locals 8
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Executor;",
            "Lcom/stripe/android/TokenCallback;",
            ")V"
        }
    .end annotation

    .line 89
    new-instance v7, Lcom/stripe/android/Stripe$2$1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p1

    move-object v5, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/Stripe$2$1;-><init>(Lcom/stripe/android/Stripe$2;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/TokenCallback;)V

    .line 117
    iget-object p1, p0, Lcom/stripe/android/Stripe$2;->this$0:Lcom/stripe/android/Stripe;

    invoke-static {p1, p5, v7}, Lcom/stripe/android/Stripe;->access$300(Lcom/stripe/android/Stripe;Ljava/util/concurrent/Executor;Landroid/os/AsyncTask;)V

    return-void
.end method
