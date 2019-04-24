.class public Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;
.super Ljava/lang/Object;
.source "TrackingAdviceFactory.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final client:Lcom/ibotta/android/tracking/TrackingClient;

.field private final resources:Landroid/content/res/Resources;

.field private final screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;Landroid/content/res/Resources;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    .line 74
    iput-object p2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 75
    iput-object p3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 76
    iput-object p4, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    .line 77
    iput-object p5, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->resources:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public createAdvice(Lcom/ibotta/android/aop/tracking/TrackingType;)Lcom/ibotta/android/aop/JoinPointAdvice;
    .locals 4

    .line 83
    sget-object v0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$TrackingType:[I

    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/TrackingType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 230
    new-instance p1, Lcom/ibotta/android/aop/NoOpAdvice;

    invoke-direct {p1}, Lcom/ibotta/android/aop/NoOpAdvice;-><init>()V

    goto/16 :goto_0

    .line 226
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/GenericAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/GenericAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 223
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiTermsAndConditionsAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiTermsAndConditionsAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 220
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiSubmitOrderAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiSubmitOrderAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 217
    :pswitch_3
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiStartEarningAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiStartEarningAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 214
    :pswitch_4
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PwiSpentToggleAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto/16 :goto_0

    .line 211
    :pswitch_5
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiRetailerTransactionsAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiRetailerTransactionsAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 208
    :pswitch_6
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiPayAtRetailerAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PwiPayAtRetailerAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto/16 :goto_0

    .line 205
    :pswitch_7
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiOrderCompleteAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiOrderCompleteAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 202
    :pswitch_8
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingCloseAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingCloseAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 199
    :pswitch_9
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingNextAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingNextAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 196
    :pswitch_a
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionsAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionsAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto/16 :goto_0

    .line 193
    :pswitch_b
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionActionAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->resources:Landroid/content/res/Resources;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PwiManageTransactionActionAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/content/res/Resources;)V

    goto/16 :goto_0

    .line 190
    :pswitch_c
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiHelpAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PwiHelpAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto/16 :goto_0

    .line 187
    :pswitch_d
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiErrorAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PwiErrorAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto/16 :goto_0

    .line 184
    :pswitch_e
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiRevealCardNumberAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiRevealCardNumberAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 181
    :pswitch_f
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiCopyCardNumberAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiCopyCardNumberAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 178
    :pswitch_10
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiConfirmPayCancelledAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiConfirmPayCancelledAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 175
    :pswitch_11
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/PwiAddPaymentMethodAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 172
    :pswitch_12
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/BgcPayAtRetailerAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/BgcPayAtRetailerAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 169
    :pswitch_13
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ConnectionLostAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/ConnectionLostAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto/16 :goto_0

    .line 166
    :pswitch_14
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/LoadTimeAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/LoadTimeAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 163
    :pswitch_15
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/DeadEndBonusAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/DeadEndBonusAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 160
    :pswitch_16
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/DeadEndSearchAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/DeadEndSearchAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 157
    :pswitch_17
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ChangedPreferenceAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ChangedPreferenceAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 154
    :pswitch_18
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/UnlockOfferAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/UnlockOfferAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 151
    :pswitch_19
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 148
    :pswitch_1a
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 145
    :pswitch_1b
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/EngagementCompleteAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/EngagementCompleteAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 142
    :pswitch_1c
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/AvailableAtRetailerIconAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/AvailableAtRetailerIconAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 139
    :pswitch_1d
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/RetailerBottomNavAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/RetailerBottomNavAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 136
    :pswitch_1e
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/BottomNavAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/BottomNavAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 133
    :pswitch_1f
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/RedeemMcommAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/RedeemMcommAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 130
    :pswitch_20
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/RedeemHeaderAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/RedeemHeaderAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 127
    :pswitch_21
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOffersDiffAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 124
    :pswitch_22
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/EngagementStartAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/EngagementStartAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 121
    :pswitch_23
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/SpotlightViewAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/SpotlightViewAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 118
    :pswitch_24
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImSharePurchaseHistoryAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImSharePurchaseHistoryAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 115
    :pswitch_25
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImCheckForRewardsViewAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImCheckForRewardsViewAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 112
    :pswitch_26
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImConnectionIssueViewAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImConnectionIssueViewAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto/16 :goto_0

    .line 109
    :pswitch_27
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImTermsAgreeClickAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImTermsAgreeClickAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 106
    :pswitch_28
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImTermsCancelClickAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImTermsCancelClickAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 103
    :pswitch_29
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginClickAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginClickAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 100
    :pswitch_2a
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImAccountCreateClickAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImAccountCreateClickAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 97
    :pswitch_2b
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginViewedAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/ImAccountLoginViewedAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 94
    :pswitch_2c
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v3, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->screenNameMap:Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/aop/tracking/advice/PageViewAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;)V

    goto :goto_0

    .line 91
    :pswitch_2d
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/OfferRetailerIconAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/OfferRetailerIconAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 88
    :pswitch_2e
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/OfferDeadEndAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/OfferDeadEndAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    goto :goto_0

    .line 85
    :pswitch_2f
    new-instance p1, Lcom/ibotta/android/aop/tracking/advice/OfferShareAdvice;

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->client:Lcom/ibotta/android/tracking/TrackingClient;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {p1, v0, v1, v2}, Lcom/ibotta/android/aop/tracking/advice/OfferShareAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
