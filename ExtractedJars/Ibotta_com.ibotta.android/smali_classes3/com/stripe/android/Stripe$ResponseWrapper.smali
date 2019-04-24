.class Lcom/stripe/android/Stripe$ResponseWrapper;
.super Ljava/lang/Object;
.source "Stripe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/Stripe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ResponseWrapper"
.end annotation


# instance fields
.field final error:Ljava/lang/Exception;

.field final source:Lcom/stripe/android/model/Source;

.field final synthetic this$0:Lcom/stripe/android/Stripe;

.field final token:Lcom/stripe/android/model/Token;


# direct methods
.method private constructor <init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/Source;)V
    .locals 0

    .line 853
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->this$0:Lcom/stripe/android/Stripe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 854
    iput-object p2, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->source:Lcom/stripe/android/model/Source;

    const/4 p1, 0x0

    .line 855
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->error:Ljava/lang/Exception;

    .line 856
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->token:Lcom/stripe/android/model/Token;

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/Source;Lcom/stripe/android/Stripe$1;)V
    .locals 0

    .line 842
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/Stripe$ResponseWrapper;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/Source;)V

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/Token;)V
    .locals 0

    .line 847
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->this$0:Lcom/stripe/android/Stripe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 848
    iput-object p2, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->token:Lcom/stripe/android/model/Token;

    const/4 p1, 0x0

    .line 849
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->source:Lcom/stripe/android/model/Source;

    .line 850
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->error:Ljava/lang/Exception;

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/Token;Lcom/stripe/android/Stripe$1;)V
    .locals 0

    .line 842
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/Stripe$ResponseWrapper;-><init>(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/Token;)V

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/Stripe;Ljava/lang/Exception;)V
    .locals 0

    .line 859
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->this$0:Lcom/stripe/android/Stripe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 860
    iput-object p2, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->error:Ljava/lang/Exception;

    const/4 p1, 0x0

    .line 861
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->source:Lcom/stripe/android/model/Source;

    .line 862
    iput-object p1, p0, Lcom/stripe/android/Stripe$ResponseWrapper;->token:Lcom/stripe/android/model/Token;

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/Stripe;Ljava/lang/Exception;Lcom/stripe/android/Stripe$1;)V
    .locals 0

    .line 842
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/Stripe$ResponseWrapper;-><init>(Lcom/stripe/android/Stripe;Ljava/lang/Exception;)V

    return-void
.end method
