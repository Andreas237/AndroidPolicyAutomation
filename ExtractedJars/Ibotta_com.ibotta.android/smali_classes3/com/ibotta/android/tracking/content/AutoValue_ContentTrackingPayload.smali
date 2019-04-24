.class final Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;
.super Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
.source "AutoValue_ContentTrackingPayload.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;
    }
.end annotation


# instance fields
.field private final amount:Ljava/lang/Float;

.field private final appNames:Ljava/lang/String;

.field private final attemptAt:Ljava/lang/Long;

.field private final attempts:Ljava/lang/Short;

.field private final bonusId:Ljava/lang/Integer;

.field private final categoryId:Ljava/lang/Integer;

.field private final categoryType:Ljava/lang/String;

.field private final clickId:Ljava/lang/Integer;

.field private final clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field private final clicked:Ljava/lang/Boolean;

.field private final contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

.field private final contextDetail:Ljava/lang/String;

.field private final counter:Ljava/lang/Integer;

.field private final dealId:Ljava/lang/String;

.field private final duration:Ljava/lang/Float;

.field private final engaged:Ljava/lang/Integer;

.field private final engagementId:Ljava/lang/Long;

.field private final entryScreen:Ljava/lang/String;

.field private final eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private final exitScreen:Ljava/lang/String;

.field private final listIndex:Ljava/lang/Integer;

.field private final messageData:Ljava/lang/String;

.field private final moduleId:Ljava/lang/Integer;

.field private final moduleIndex:Ljava/lang/Integer;

.field private final moduleName:Ljava/lang/String;

.field private final noTracking:Z

.field private final notificationId:Ljava/lang/Integer;

.field private final notificationText:Ljava/lang/String;

.field private final notificationType:Ljava/lang/String;

.field private final offerCategoryId:Ljava/lang/Integer;

.field private final offerId:Ljava/lang/Integer;

.field private final offerRewardId:Ljava/lang/Integer;

.field private final offerSegmentId:Ljava/lang/Integer;

.field private final productId:Ljava/lang/String;

.field private final promoId:Ljava/lang/Integer;

.field private final questName:Ljava/lang/String;

.field private final questState:Ljava/lang/String;

.field private final questStep:Ljava/lang/Integer;

.field private final referralCode:Ljava/lang/String;

.field private final referrer:Ljava/lang/String;

.field private final retailerCategoryId:Ljava/lang/Integer;

.field private final retailerId:Ljava/lang/Integer;

.field private final searchType:Ljava/lang/String;

.field private final status:Ljava/lang/String;

.field private final term:Ljava/lang/String;

.field private final test:Ljava/lang/String;

.field private final thirdPartyId:Ljava/lang/String;

.field private final tileId:Ljava/lang/Integer;

.field private final upc:Ljava/lang/String;

.field private final variant:Ljava/lang/String;


# direct methods
.method private constructor <init>(ZLcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Short;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p20    # Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/Short;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p44    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p45    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p46    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    move-object v0, p0

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;-><init>()V

    move v1, p1

    .line 114
    iput-boolean v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->noTracking:Z

    move-object v1, p2

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-object v1, p3

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-object v1, p4

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerId:Ljava/lang/Integer;

    move-object v1, p5

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerId:Ljava/lang/Integer;

    move-object v1, p6

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerCategoryId:Ljava/lang/Integer;

    move-object v1, p7

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerRewardId:Ljava/lang/Integer;

    move-object v1, p8

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->bonusId:Ljava/lang/Integer;

    move-object v1, p9

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerCategoryId:Ljava/lang/Integer;

    move-object v1, p10

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->promoId:Ljava/lang/Integer;

    move-object v1, p11

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->tileId:Ljava/lang/Integer;

    move-object v1, p12

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->productId:Ljava/lang/String;

    move-object v1, p13

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->dealId:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleId:Ljava/lang/Integer;

    move-object/from16 v1, p15

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleName:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleIndex:Ljava/lang/Integer;

    move-object/from16 v1, p17

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->listIndex:Ljava/lang/Integer;

    move-object/from16 v1, p18

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clicked:Ljava/lang/Boolean;

    move-object/from16 v1, p19

    .line 132
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickId:Ljava/lang/Integer;

    move-object/from16 v1, p20

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-object/from16 v1, p21

    .line 134
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referrer:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 135
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->term:Ljava/lang/String;

    move-object/from16 v1, p23

    .line 136
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->upc:Ljava/lang/String;

    move-object/from16 v1, p24

    .line 137
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->test:Ljava/lang/String;

    move-object/from16 v1, p25

    .line 138
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->variant:Ljava/lang/String;

    move-object/from16 v1, p26

    .line 139
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->thirdPartyId:Ljava/lang/String;

    move-object/from16 v1, p27

    .line 140
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referralCode:Ljava/lang/String;

    move-object/from16 v1, p28

    .line 141
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->appNames:Ljava/lang/String;

    move-object/from16 v1, p29

    .line 142
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerSegmentId:Ljava/lang/Integer;

    move-object/from16 v1, p30

    .line 143
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->counter:Ljava/lang/Integer;

    move-object/from16 v1, p31

    .line 144
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engaged:Ljava/lang/Integer;

    move-object/from16 v1, p32

    .line 145
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->duration:Ljava/lang/Float;

    move-object/from16 v1, p33

    .line 146
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attempts:Ljava/lang/Short;

    move-object/from16 v1, p34

    .line 147
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attemptAt:Ljava/lang/Long;

    move-object/from16 v1, p35

    .line 148
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questName:Ljava/lang/String;

    move-object/from16 v1, p36

    .line 149
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questState:Ljava/lang/String;

    move-object/from16 v1, p37

    .line 150
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questStep:Ljava/lang/Integer;

    move-object/from16 v1, p38

    .line 151
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryId:Ljava/lang/Integer;

    move-object/from16 v1, p39

    .line 152
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryType:Ljava/lang/String;

    move-object/from16 v1, p40

    .line 153
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->searchType:Ljava/lang/String;

    move-object/from16 v1, p41

    .line 154
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engagementId:Ljava/lang/Long;

    move-object/from16 v1, p42

    .line 155
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationText:Ljava/lang/String;

    move-object/from16 v1, p43

    .line 156
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationType:Ljava/lang/String;

    move-object/from16 v1, p44

    .line 157
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->entryScreen:Ljava/lang/String;

    move-object/from16 v1, p45

    .line 158
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->exitScreen:Ljava/lang/String;

    move-object/from16 v1, p46

    .line 159
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationId:Ljava/lang/Integer;

    move-object/from16 v1, p47

    .line 160
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->amount:Ljava/lang/Float;

    move-object/from16 v1, p48

    .line 161
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->status:Ljava/lang/String;

    move-object/from16 v1, p49

    .line 162
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->messageData:Ljava/lang/String;

    move-object/from16 v1, p50

    .line 163
    iput-object v1, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contextDetail:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(ZLcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Short;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$1;)V
    .locals 0

    .line 10
    invoke-direct/range {p0 .. p50}, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;-><init>(ZLcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Short;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 525
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const/4 v2, 0x0

    if-eqz v1, :cond_32

    .line 526
    check-cast p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    .line 527
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->noTracking:Z

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->isNoTracking()Z

    move-result v3

    if-ne v1, v3, :cond_31

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    if-nez v1, :cond_1

    .line 528
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 529
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 530
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerId:Ljava/lang/Integer;

    if-nez v1, :cond_3

    .line 531
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerCategoryId:Ljava/lang/Integer;

    if-nez v1, :cond_4

    .line 532
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferCategoryId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferCategoryId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerRewardId:Ljava/lang/Integer;

    if-nez v1, :cond_5

    .line 533
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferRewardId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferRewardId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->bonusId:Ljava/lang/Integer;

    if-nez v1, :cond_6

    .line 534
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getBonusId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getBonusId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerCategoryId:Ljava/lang/Integer;

    if-nez v1, :cond_7

    .line 535
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerCategoryId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerCategoryId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->promoId:Ljava/lang/Integer;

    if-nez v1, :cond_8

    .line 536
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getPromoId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_7

    :cond_8
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getPromoId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->tileId:Ljava/lang/Integer;

    if-nez v1, :cond_9

    .line 537
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTileId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_8

    :cond_9
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTileId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->productId:Ljava/lang/String;

    if-nez v1, :cond_a

    .line 538
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getProductId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_9

    :cond_a
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getProductId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->dealId:Ljava/lang/String;

    if-nez v1, :cond_b

    .line 539
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDealId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_a

    :cond_b
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDealId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleId:Ljava/lang/Integer;

    if-nez v1, :cond_c

    .line 540
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_b

    :cond_c
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleName:Ljava/lang/String;

    if-nez v1, :cond_d

    .line 541
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_c

    :cond_d
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleIndex:Ljava/lang/Integer;

    if-nez v1, :cond_e

    .line 542
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleIndex()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_d

    :cond_e
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleIndex()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->listIndex:Ljava/lang/Integer;

    if-nez v1, :cond_f

    .line 543
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getListIndex()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_e

    :cond_f
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getListIndex()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clicked:Ljava/lang/Boolean;

    if-nez v1, :cond_10

    .line 544
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClicked()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_f

    :cond_10
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClicked()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickId:Ljava/lang/Integer;

    if-nez v1, :cond_11

    .line 545
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_10

    :cond_11
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_10
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    if-nez v1, :cond_12

    .line 546
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickType()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_11

    :cond_12
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickType()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_11
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referrer:Ljava/lang/String;

    if-nez v1, :cond_13

    .line 547
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferrer()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_12

    :cond_13
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferrer()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_12
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->term:Ljava/lang/String;

    if-nez v1, :cond_14

    .line 548
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTerm()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_13

    :cond_14
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_13
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->upc:Ljava/lang/String;

    if-nez v1, :cond_15

    .line 549
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getUpc()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_14

    :cond_15
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getUpc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_14
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->test:Ljava/lang/String;

    if-nez v1, :cond_16

    .line 550
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTest()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_15

    :cond_16
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTest()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_15
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->variant:Ljava/lang/String;

    if-nez v1, :cond_17

    .line 551
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getVariant()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_16

    :cond_17
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getVariant()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_16
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->thirdPartyId:Ljava/lang/String;

    if-nez v1, :cond_18

    .line 552
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getThirdPartyId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_17

    :cond_18
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getThirdPartyId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_17
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referralCode:Ljava/lang/String;

    if-nez v1, :cond_19

    .line 553
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferralCode()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_18

    :cond_19
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferralCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_18
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->appNames:Ljava/lang/String;

    if-nez v1, :cond_1a

    .line 554
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAppNames()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_19

    :cond_1a
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAppNames()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_19
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerSegmentId:Ljava/lang/Integer;

    if-nez v1, :cond_1b

    .line 555
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferSegmentId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1a

    :cond_1b
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferSegmentId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1a
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->counter:Ljava/lang/Integer;

    if-nez v1, :cond_1c

    .line 556
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCounter()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1b

    :cond_1c
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCounter()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1b
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engaged:Ljava/lang/Integer;

    if-nez v1, :cond_1d

    .line 557
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngaged()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1c

    :cond_1d
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngaged()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1c
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->duration:Ljava/lang/Float;

    if-nez v1, :cond_1e

    .line 558
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDuration()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1d

    :cond_1e
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDuration()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Float;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1d
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attempts:Ljava/lang/Short;

    if-nez v1, :cond_1f

    .line 559
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttempts()Ljava/lang/Short;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1e

    :cond_1f
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttempts()Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Short;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1e
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attemptAt:Ljava/lang/Long;

    if-nez v1, :cond_20

    .line 560
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttemptAt()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1f

    :cond_20
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttemptAt()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1f
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questName:Ljava/lang/String;

    if-nez v1, :cond_21

    .line 561
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_20

    :cond_21
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_20
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questState:Ljava/lang/String;

    if-nez v1, :cond_22

    .line 562
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestState()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_21

    :cond_22
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_21
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questStep:Ljava/lang/Integer;

    if-nez v1, :cond_23

    .line 563
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestStep()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_22

    :cond_23
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestStep()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_22
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryId:Ljava/lang/Integer;

    if-nez v1, :cond_24

    .line 564
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_23

    :cond_24
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_23
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryType:Ljava/lang/String;

    if-nez v1, :cond_25

    .line 565
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_24

    :cond_25
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_24
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->searchType:Ljava/lang/String;

    if-nez v1, :cond_26

    .line 566
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getSearchType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_25

    :cond_26
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getSearchType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_25
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engagementId:Ljava/lang/Long;

    if-nez v1, :cond_27

    .line 567
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngagementId()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_26

    :cond_27
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngagementId()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_26
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationText:Ljava/lang/String;

    if-nez v1, :cond_28

    .line 568
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_27

    :cond_28
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_27
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationType:Ljava/lang/String;

    if-nez v1, :cond_29

    .line 569
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_28

    :cond_29
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_28
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->entryScreen:Ljava/lang/String;

    if-nez v1, :cond_2a

    .line 570
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEntryScreen()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_29

    :cond_2a
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEntryScreen()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_29
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->exitScreen:Ljava/lang/String;

    if-nez v1, :cond_2b

    .line 571
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getExitScreen()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2a

    :cond_2b
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getExitScreen()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2a
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationId:Ljava/lang/Integer;

    if-nez v1, :cond_2c

    .line 572
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2b

    :cond_2c
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2b
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->amount:Ljava/lang/Float;

    if-nez v1, :cond_2d

    .line 573
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAmount()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2c

    :cond_2d
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAmount()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Float;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2c
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->status:Ljava/lang/String;

    if-nez v1, :cond_2e

    .line 574
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getStatus()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2d

    :cond_2e
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getStatus()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2d
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->messageData:Ljava/lang/String;

    if-nez v1, :cond_2f

    .line 575
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getMessageData()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2e

    :cond_2f
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getMessageData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2e
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contextDetail:Ljava/lang/String;

    if-nez v1, :cond_30

    .line 576
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContextDetail()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_31

    goto :goto_2f

    :cond_30
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContextDetail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    goto :goto_2f

    :cond_31
    const/4 v0, 0x0

    :goto_2f
    return v0

    :cond_32
    return v2
.end method

.method public getAmount()Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 443
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->amount:Ljava/lang/Float;

    return-object v0
.end method

.method public getAppNames()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 329
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->appNames:Ljava/lang/String;

    return-object v0
.end method

.method public getAttemptAt()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 365
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attemptAt:Ljava/lang/Long;

    return-object v0
.end method

.method public getAttempts()Ljava/lang/Short;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 359
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attempts:Ljava/lang/Short;

    return-object v0
.end method

.method public getBonusId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->bonusId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCategoryId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCategoryType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryType:Ljava/lang/String;

    return-object v0
.end method

.method public getClickId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getClickType()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    return-object v0
.end method

.method public getClicked()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clicked:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    return-object v0
.end method

.method public getContextDetail()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 461
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contextDetail:Ljava/lang/String;

    return-object v0
.end method

.method public getCounter()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->counter:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDealId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->dealId:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 353
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->duration:Ljava/lang/Float;

    return-object v0
.end method

.method public getEngaged()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engaged:Ljava/lang/Integer;

    return-object v0
.end method

.method public getEngagementId()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 407
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engagementId:Ljava/lang/Long;

    return-object v0
.end method

.method public getEntryScreen()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 425
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->entryScreen:Ljava/lang/String;

    return-object v0
.end method

.method public getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object v0
.end method

.method public getExitScreen()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 431
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->exitScreen:Ljava/lang/String;

    return-object v0
.end method

.method public getListIndex()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->listIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMessageData()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 455
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->messageData:Ljava/lang/String;

    return-object v0
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleIndex()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleName:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 437
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getNotificationText()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationText:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 419
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationType:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferCategoryId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerCategoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferRewardId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerRewardId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferSegmentId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 335
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerSegmentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->promoId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQuestName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questName:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestState()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 377
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questState:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestStep()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 383
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questStep:Ljava/lang/Integer;

    return-object v0
.end method

.method public getReferralCode()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referralCode:Ljava/lang/String;

    return-object v0
.end method

.method public getReferrer()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referrer:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerCategoryId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerCategoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSearchType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 401
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->searchType:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 449
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTerm()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 293
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->term:Ljava/lang/String;

    return-object v0
.end method

.method public getTest()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->test:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdPartyId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->thirdPartyId:Ljava/lang/String;

    return-object v0
.end method

.method public getTileId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->tileId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUpc()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 299
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->upc:Ljava/lang/String;

    return-object v0
.end method

.method public getVariant()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->variant:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 585
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->noTracking:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 587
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 589
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 591
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerId:Ljava/lang/Integer;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 593
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerId:Ljava/lang/Integer;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 595
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerCategoryId:Ljava/lang/Integer;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 597
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerRewardId:Ljava/lang/Integer;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 599
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->bonusId:Ljava/lang/Integer;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 601
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerCategoryId:Ljava/lang/Integer;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 603
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->promoId:Ljava/lang/Integer;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 605
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->tileId:Ljava/lang/Integer;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 607
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->productId:Ljava/lang/String;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 609
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->dealId:Ljava/lang/String;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 611
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleId:Ljava/lang/Integer;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 613
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleName:Ljava/lang/String;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 615
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleIndex:Ljava/lang/Integer;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 617
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->listIndex:Ljava/lang/Integer;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 619
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clicked:Ljava/lang/Boolean;

    if-nez v2, :cond_10

    const/4 v2, 0x0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_10
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 621
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickId:Ljava/lang/Integer;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_11
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 623
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->hashCode()I

    move-result v2

    :goto_12
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 625
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referrer:Ljava/lang/String;

    if-nez v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 627
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->term:Ljava/lang/String;

    if-nez v2, :cond_14

    const/4 v2, 0x0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_14
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 629
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->upc:Ljava/lang/String;

    if-nez v2, :cond_15

    const/4 v2, 0x0

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_15
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 631
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->test:Ljava/lang/String;

    if-nez v2, :cond_16

    const/4 v2, 0x0

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_16
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 633
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->variant:Ljava/lang/String;

    if-nez v2, :cond_17

    const/4 v2, 0x0

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 635
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->thirdPartyId:Ljava/lang/String;

    if-nez v2, :cond_18

    const/4 v2, 0x0

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_18
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 637
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referralCode:Ljava/lang/String;

    if-nez v2, :cond_19

    const/4 v2, 0x0

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 639
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->appNames:Ljava/lang/String;

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 641
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerSegmentId:Ljava/lang/Integer;

    if-nez v2, :cond_1b

    const/4 v2, 0x0

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_1b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 643
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->counter:Ljava/lang/Integer;

    if-nez v2, :cond_1c

    const/4 v2, 0x0

    goto :goto_1c

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_1c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 645
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engaged:Ljava/lang/Integer;

    if-nez v2, :cond_1d

    const/4 v2, 0x0

    goto :goto_1d

    :cond_1d
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_1d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 647
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->duration:Ljava/lang/Float;

    if-nez v2, :cond_1e

    const/4 v2, 0x0

    goto :goto_1e

    :cond_1e
    invoke-virtual {v2}, Ljava/lang/Float;->hashCode()I

    move-result v2

    :goto_1e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 649
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attempts:Ljava/lang/Short;

    if-nez v2, :cond_1f

    const/4 v2, 0x0

    goto :goto_1f

    :cond_1f
    invoke-virtual {v2}, Ljava/lang/Short;->hashCode()I

    move-result v2

    :goto_1f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 651
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attemptAt:Ljava/lang/Long;

    if-nez v2, :cond_20

    const/4 v2, 0x0

    goto :goto_20

    :cond_20
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_20
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 653
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questName:Ljava/lang/String;

    if-nez v2, :cond_21

    const/4 v2, 0x0

    goto :goto_21

    :cond_21
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_21
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 655
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questState:Ljava/lang/String;

    if-nez v2, :cond_22

    const/4 v2, 0x0

    goto :goto_22

    :cond_22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_22
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 657
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questStep:Ljava/lang/Integer;

    if-nez v2, :cond_23

    const/4 v2, 0x0

    goto :goto_23

    :cond_23
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_23
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 659
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryId:Ljava/lang/Integer;

    if-nez v2, :cond_24

    const/4 v2, 0x0

    goto :goto_24

    :cond_24
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_24
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 661
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryType:Ljava/lang/String;

    if-nez v2, :cond_25

    const/4 v2, 0x0

    goto :goto_25

    :cond_25
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_25
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 663
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->searchType:Ljava/lang/String;

    if-nez v2, :cond_26

    const/4 v2, 0x0

    goto :goto_26

    :cond_26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_26
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 665
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engagementId:Ljava/lang/Long;

    if-nez v2, :cond_27

    const/4 v2, 0x0

    goto :goto_27

    :cond_27
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_27
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 667
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationText:Ljava/lang/String;

    if-nez v2, :cond_28

    const/4 v2, 0x0

    goto :goto_28

    :cond_28
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_28
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 669
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationType:Ljava/lang/String;

    if-nez v2, :cond_29

    const/4 v2, 0x0

    goto :goto_29

    :cond_29
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_29
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 671
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->entryScreen:Ljava/lang/String;

    if-nez v2, :cond_2a

    const/4 v2, 0x0

    goto :goto_2a

    :cond_2a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 673
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->exitScreen:Ljava/lang/String;

    if-nez v2, :cond_2b

    const/4 v2, 0x0

    goto :goto_2b

    :cond_2b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 675
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationId:Ljava/lang/Integer;

    if-nez v2, :cond_2c

    const/4 v2, 0x0

    goto :goto_2c

    :cond_2c
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_2c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 677
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->amount:Ljava/lang/Float;

    if-nez v2, :cond_2d

    const/4 v2, 0x0

    goto :goto_2d

    :cond_2d
    invoke-virtual {v2}, Ljava/lang/Float;->hashCode()I

    move-result v2

    :goto_2d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 679
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->status:Ljava/lang/String;

    if-nez v2, :cond_2e

    const/4 v2, 0x0

    goto :goto_2e

    :cond_2e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 681
    iget-object v2, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->messageData:Ljava/lang/String;

    if-nez v2, :cond_2f

    const/4 v2, 0x0

    goto :goto_2f

    :cond_2f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 683
    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contextDetail:Ljava/lang/String;

    if-nez v1, :cond_30

    goto :goto_30

    :cond_30
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_30
    xor-int/2addr v0, v3

    return v0
.end method

.method public isNoTracking()Z
    .locals 1

    .line 168
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->noTracking:Z

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 2

    .line 689
    new-instance v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;-><init>(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 466
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentTrackingPayload{noTracking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->noTracking:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", contentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerCategoryId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerCategoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerRewardId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerRewardId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bonusId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->bonusId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerCategoryId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->retailerCategoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", promoId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->promoId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tileId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->tileId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dealId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->dealId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", moduleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moduleName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", moduleIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->moduleIndex:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->listIndex:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clicked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clicked:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clickId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clickType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", referrer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referrer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", term="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->term:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", upc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->upc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", test="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->test:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->variant:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", thirdPartyId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->thirdPartyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", referralCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->referralCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appNames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->appNames:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offerSegmentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->offerSegmentId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", counter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->counter:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", engaged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engaged:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->duration:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attempts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attempts:Ljava/lang/Short;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attemptAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->attemptAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", questName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questState:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->questStep:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", categoryId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", categoryType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->categoryType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", searchType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->searchType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", engagementId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->engagementId:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", entryScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->entryScreen:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", exitScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->exitScreen:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->notificationId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->amount:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->messageData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", contextDetail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;->contextDetail:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
