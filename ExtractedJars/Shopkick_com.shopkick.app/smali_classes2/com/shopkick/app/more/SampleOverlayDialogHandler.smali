.class public Lcom/shopkick/app/more/SampleOverlayDialogHandler;
.super Ljava/lang/Object;
.source "SampleOverlayDialogHandler.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# instance fields
.field alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field cancelButton:Lcom/shopkick/app/widget/SKButton;

.field clickListener:Landroid/view/View$OnClickListener;

.field context:Landroid/content/Context;

.field d:Landroid/app/Dialog;

.field dialogLayout:Landroid/widget/ScrollView;

.field globalAutoDismissLayered:Landroid/widget/TextView;

.field globalBallAnimation:Landroid/widget/TextView;

.field globalBirthday:Landroid/widget/TextView;

.field globalCelebratoryEscrowMaturedKicks:Landroid/widget/TextView;

.field globalCelebratoryReceiptKicks:Landroid/widget/TextView;

.field globalClearBg:Landroid/widget/TextView;

.field globalDelayedLayered:Landroid/widget/TextView;

.field globalInstantBonus:Landroid/widget/TextView;

.field globalKicksOnTheWay:Landroid/widget/TextView;

.field globalLayered:Landroid/widget/TextView;

.field globalMikaReceiver:Landroid/widget/TextView;

.field globalPostScan:Landroid/widget/TextView;

.field globalPostScanSurvey:Landroid/widget/TextView;

.field globalReceiptScanReminder:Landroid/widget/TextView;

.field globalReceiptScanReminderV2:Landroid/widget/TextView;

.field globalScanMissionCompleted:Landroid/widget/TextView;

.field globalTapToDismissLayered:Landroid/widget/TextView;

.field globalWebviewLayered:Landroid/widget/TextView;

.field globalYellowBg:Landroid/widget/TextView;

.field localAutoDismissLayered:Landroid/widget/TextView;

.field localDelayedLayered:Landroid/widget/TextView;

.field localTopScreenLayered:Landroid/widget/TextView;

.field overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

.field overlaysToAdd:Landroid/widget/TextView;

.field submitButton:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    .line 26
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 27
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 28
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->context:Landroid/content/Context;

    .line 29
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    .line 30
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaysToAdd:Landroid/widget/TextView;

    .line 31
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->submitButton:Lcom/shopkick/app/widget/SKButton;

    .line 32
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    .line 33
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    .line 36
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalLayered:Landroid/widget/TextView;

    .line 37
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalDelayedLayered:Landroid/widget/TextView;

    .line 38
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalAutoDismissLayered:Landroid/widget/TextView;

    .line 39
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localTopScreenLayered:Landroid/widget/TextView;

    .line 40
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localDelayedLayered:Landroid/widget/TextView;

    .line 41
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localAutoDismissLayered:Landroid/widget/TextView;

    .line 42
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalTapToDismissLayered:Landroid/widget/TextView;

    .line 43
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalWebviewLayered:Landroid/widget/TextView;

    .line 44
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBallAnimation:Landroid/widget/TextView;

    .line 45
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalInstantBonus:Landroid/widget/TextView;

    .line 46
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalClearBg:Landroid/widget/TextView;

    .line 47
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalYellowBg:Landroid/widget/TextView;

    .line 48
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScan:Landroid/widget/TextView;

    .line 49
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScanSurvey:Landroid/widget/TextView;

    .line 50
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalScanMissionCompleted:Landroid/widget/TextView;

    .line 51
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBirthday:Landroid/widget/TextView;

    .line 52
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminder:Landroid/widget/TextView;

    .line 53
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryReceiptKicks:Landroid/widget/TextView;

    .line 54
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryEscrowMaturedKicks:Landroid/widget/TextView;

    .line 55
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalKicksOnTheWay:Landroid/widget/TextView;

    .line 56
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalMikaReceiver:Landroid/widget/TextView;

    .line 57
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminderV2:Landroid/widget/TextView;

    .line 144
    new-instance v0, Lcom/shopkick/app/more/-$$Lambda$SampleOverlayDialogHandler$4fsz9JbTthvLW2thqp_KJGbCVSY;

    invoke-direct {v0, p0}, Lcom/shopkick/app/more/-$$Lambda$SampleOverlayDialogHandler$4fsz9JbTthvLW2thqp_KJGbCVSY;-><init>(Lcom/shopkick/app/more/SampleOverlayDialogHandler;)V

    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->context:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 62
    iput-object p3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public static synthetic lambda$new$123(Lcom/shopkick/app/more/SampleOverlayDialogHandler;Landroid/view/View;)V
    .locals 4

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    if-eqz p1, :cond_1c

    .line 147
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    goto/16 :goto_2

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->submitButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_3

    .line 150
    iget-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaysToAdd:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1c

    .line 151
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1c

    const-string v0, ","

    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    if-eqz v0, :cond_1

    .line 154
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 156
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;->overlayTypes:Ljava/util/List;

    .line 158
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 159
    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;->overlayTypes:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 161
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    goto/16 :goto_2

    :cond_3
    const/4 v0, -0x1

    .line 166
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaysToAdd:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, ""

    .line 170
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_5

    const/4 v0, 0x1

    goto/16 :goto_1

    .line 172
    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalDelayedLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_6

    const/4 v0, 0x2

    goto/16 :goto_1

    .line 174
    :cond_6
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalAutoDismissLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_7

    const/4 v0, 0x3

    goto/16 :goto_1

    .line 176
    :cond_7
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localTopScreenLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_8

    const/4 v0, 0x4

    goto/16 :goto_1

    .line 178
    :cond_8
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localDelayedLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_9

    const/4 v0, 0x5

    goto/16 :goto_1

    .line 180
    :cond_9
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localAutoDismissLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_a

    const/4 v0, 0x6

    goto/16 :goto_1

    .line 182
    :cond_a
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalTapToDismissLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_b

    const/4 v0, 0x7

    goto/16 :goto_1

    .line 184
    :cond_b
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalWebviewLayered:Landroid/widget/TextView;

    if-ne p1, v2, :cond_c

    const/16 v0, 0x8

    goto/16 :goto_1

    .line 186
    :cond_c
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBallAnimation:Landroid/widget/TextView;

    if-ne p1, v2, :cond_d

    const/16 v0, 0x64

    goto/16 :goto_1

    .line 188
    :cond_d
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalInstantBonus:Landroid/widget/TextView;

    if-ne p1, v2, :cond_e

    const/16 v0, 0xc8

    goto :goto_1

    .line 190
    :cond_e
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalClearBg:Landroid/widget/TextView;

    if-ne p1, v2, :cond_f

    const/16 v0, 0x9

    goto :goto_1

    .line 192
    :cond_f
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalYellowBg:Landroid/widget/TextView;

    if-ne p1, v2, :cond_10

    const/16 v0, 0xa

    goto :goto_1

    .line 194
    :cond_10
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScan:Landroid/widget/TextView;

    if-ne p1, v2, :cond_11

    const/16 v0, 0x12c

    goto :goto_1

    .line 196
    :cond_11
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScanSurvey:Landroid/widget/TextView;

    if-ne p1, v2, :cond_12

    const/16 v0, 0x12d

    goto :goto_1

    .line 198
    :cond_12
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalScanMissionCompleted:Landroid/widget/TextView;

    if-ne p1, v2, :cond_13

    const/16 v0, 0x12e

    goto :goto_1

    .line 200
    :cond_13
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBirthday:Landroid/widget/TextView;

    if-ne p1, v2, :cond_14

    const/16 v0, 0x190

    goto :goto_1

    .line 202
    :cond_14
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminder:Landroid/widget/TextView;

    if-ne p1, v2, :cond_15

    const/16 v0, 0x130

    goto :goto_1

    .line 204
    :cond_15
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryReceiptKicks:Landroid/widget/TextView;

    if-ne p1, v2, :cond_16

    const/16 v0, 0x131

    goto :goto_1

    .line 206
    :cond_16
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryEscrowMaturedKicks:Landroid/widget/TextView;

    if-ne p1, v2, :cond_17

    const/16 v0, 0x132

    goto :goto_1

    .line 208
    :cond_17
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalKicksOnTheWay:Landroid/widget/TextView;

    if-ne p1, v2, :cond_18

    const/16 v0, 0x133

    goto :goto_1

    .line 210
    :cond_18
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalMikaReceiver:Landroid/widget/TextView;

    if-ne p1, v2, :cond_19

    const/16 v0, 0x191

    goto :goto_1

    .line 212
    :cond_19
    iget-object v2, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminderV2:Landroid/widget/TextView;

    if-ne p1, v2, :cond_1a

    const/16 v0, 0x134

    .line 216
    :cond_1a
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_1b

    .line 217
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 219
    :cond_1b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaysToAdd:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1c
    :goto_2
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    if-ne p1, v0, :cond_1

    .line 231
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const-string p2, "GET OVERLAY SAMPLES DONE!"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 234
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GET OVERLAY SAMPLES FAILED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_1
    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    .line 67
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    if-eqz v1, :cond_0

    .line 68
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 70
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaySamplesRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOverlaySamplesRequest;

    if-eqz v0, :cond_1

    .line 72
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_1
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public showDialog()V
    .locals 5

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const v1, 0x7f0c00d1

    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0902a5

    .line 80
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v1, 0x7f090663

    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaysToAdd:Landroid/widget/TextView;

    const v1, 0x7f0901fe

    .line 83
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f0901f8

    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    .line 86
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b7

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalLayered:Landroid/widget/TextView;

    .line 87
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b8

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalDelayedLayered:Landroid/widget/TextView;

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902af

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalAutoDismissLayered:Landroid/widget/TextView;

    .line 89
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f090437

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localTopScreenLayered:Landroid/widget/TextView;

    .line 90
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f090436

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localDelayedLayered:Landroid/widget/TextView;

    .line 91
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f090435

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localAutoDismissLayered:Landroid/widget/TextView;

    .line 92
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902bf

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalTapToDismissLayered:Landroid/widget/TextView;

    .line 93
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902c0

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalWebviewLayered:Landroid/widget/TextView;

    .line 94
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b0

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBallAnimation:Landroid/widget/TextView;

    .line 95
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b5

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalInstantBonus:Landroid/widget/TextView;

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b4

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalClearBg:Landroid/widget/TextView;

    .line 97
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902c1

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalYellowBg:Landroid/widget/TextView;

    .line 98
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902ba

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScan:Landroid/widget/TextView;

    .line 99
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902bb

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScanSurvey:Landroid/widget/TextView;

    .line 100
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902be

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalScanMissionCompleted:Landroid/widget/TextView;

    .line 101
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b1

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBirthday:Landroid/widget/TextView;

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b3

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryReceiptKicks:Landroid/widget/TextView;

    .line 103
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b2

    .line 104
    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryEscrowMaturedKicks:Landroid/widget/TextView;

    .line 105
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b6

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalKicksOnTheWay:Landroid/widget/TextView;

    .line 106
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902b9

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalMikaReceiver:Landroid/widget/TextView;

    .line 107
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902bc

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminder:Landroid/widget/TextView;

    .line 108
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->dialogLayout:Landroid/widget/ScrollView;

    const v3, 0x7f0902bd

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminderV2:Landroid/widget/TextView;

    .line 110
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalDelayedLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalAutoDismissLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localTopScreenLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localDelayedLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localAutoDismissLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->localAutoDismissLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalTapToDismissLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalWebviewLayered:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBallAnimation:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalInstantBonus:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalClearBg:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalYellowBg:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScan:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalPostScanSurvey:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalScanMissionCompleted:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalBirthday:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminder:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryReceiptKicks:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalCelebratoryEscrowMaturedKicks:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalKicksOnTheWay:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalMikaReceiver:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->globalReceiptScanReminderV2:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->submitButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    new-instance v1, Landroid/app/Dialog;

    iget-object v3, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->context:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    .line 137
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v3}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->overlaysToAdd:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
