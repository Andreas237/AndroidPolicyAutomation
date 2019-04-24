.class final Lcom/stripe/android/StripeApiHandler$Parameter;
.super Ljava/lang/Object;
.source "StripeApiHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/StripeApiHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Parameter"
.end annotation


# instance fields
.field public final key:Ljava/lang/String;

.field public final value:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1292
    iput-object p1, p0, Lcom/stripe/android/StripeApiHandler$Parameter;->key:Ljava/lang/String;

    .line 1293
    iput-object p2, p0, Lcom/stripe/android/StripeApiHandler$Parameter;->value:Ljava/lang/String;

    return-void
.end method
