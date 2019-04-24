.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$StripeManagerImpl$XKZ3MRhas-CxcFoOBgo08kKqy2A;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/stripe/android/EphemeralKeyProvider;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$StripeManagerImpl$XKZ3MRhas-CxcFoOBgo08kKqy2A;->f$0:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    return-void
.end method


# virtual methods
.method public final createEphemeralKey(Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$StripeManagerImpl$XKZ3MRhas-CxcFoOBgo08kKqy2A;->f$0:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    invoke-static {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;->lambda$initStripeCustomerSession$0(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V

    return-void
.end method
