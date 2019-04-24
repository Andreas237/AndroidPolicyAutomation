.class public Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;
.super Ljava/lang/Object;
.source "BlacklistClassifierFactory.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    return-void
.end method


# virtual methods
.method public create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;
    .locals 4

    .line 52
    :try_start_0
    sget-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory$1;->$SwitchMap$com$ibotta$android$blacklist$BlacklistClassifierType:[I

    invoke-virtual {p1}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 141
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/NoOpClassifier;

    goto/16 :goto_0

    .line 136
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;-><init>(Ljava/lang/String;)V

    .line 137
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 132
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;-><init>(Ljava/lang/String;)V

    .line 133
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 128
    :pswitch_2
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;-><init>(Ljava/lang/String;)V

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 124
    :pswitch_3
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanOrEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanOrEqualClassifier;-><init>(Ljava/lang/Integer;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getOsVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 120
    :pswitch_4
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;-><init>(Ljava/lang/Integer;)V

    .line 121
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getOsVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 116
    :pswitch_5
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;-><init>(Ljava/lang/Integer;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    .line 117
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getOsVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 112
    :pswitch_6
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntLessThanClassifier;-><init>(Ljava/lang/Integer;)V

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getOsVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 108
    :pswitch_7
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntNotEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntNotEqualClassifier;-><init>(Ljava/lang/Integer;)V

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getOsVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 104
    :pswitch_8
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;-><init>(Ljava/lang/Integer;)V

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getOsVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 100
    :pswitch_9
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionGreaterThanOrEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, v1, v2, p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionGreaterThanOrEqualClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto/16 :goto_1

    .line 96
    :pswitch_a
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionGreaterThanClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionGreaterThanClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto/16 :goto_1

    .line 93
    :pswitch_b
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, v1, v2, p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto/16 :goto_1

    .line 89
    :pswitch_c
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto/16 :goto_1

    .line 85
    :pswitch_d
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionNotEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionNotEqualClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto/16 :goto_1

    .line 81
    :pswitch_e
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto/16 :goto_1

    .line 78
    :pswitch_f
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanOrEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanOrEqualClassifier;-><init>(Ljava/lang/Integer;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto :goto_1

    .line 75
    :pswitch_10
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;-><init>(Ljava/lang/Integer;)V

    goto :goto_1

    .line 72
    :pswitch_11
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;-><init>(Ljava/lang/Integer;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    goto :goto_1

    .line 69
    :pswitch_12
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntLessThanClassifier;-><init>(Ljava/lang/Integer;)V

    goto :goto_1

    .line 66
    :pswitch_13
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntNotEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntNotEqualClassifier;-><init>(Ljava/lang/Integer;)V

    goto :goto_1

    .line 63
    :pswitch_14
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;-><init>(Ljava/lang/Integer;)V

    goto :goto_1

    .line 60
    :pswitch_15
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 57
    :pswitch_16
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 54
    :pswitch_17
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 141
    :goto_0
    invoke-direct {v0}, Lcom/ibotta/android/blacklist/classifiers/NoOpClassifier;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "Failed to create BlacklistClassifier: type=%1$s, criteria=%2$s"

    const/4 v2, 0x2

    .line 145
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    new-instance v0, Lcom/ibotta/android/blacklist/classifiers/NoOpClassifier;

    invoke-direct {v0}, Lcom/ibotta/android/blacklist/classifiers/NoOpClassifier;-><init>()V

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public create(Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;)Lcom/ibotta/android/blacklist/BlacklistClassifier;
    .locals 1

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->getCriteria()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object p1

    return-object p1
.end method
