.class public Lio/fabric/sdk/android/services/settings/PromptSettingsData;
.super Ljava/lang/Object;
.source "PromptSettingsData.java"


# instance fields
.field public final alwaysSendButtonTitle:Ljava/lang/String;

.field public final cancelButtonTitle:Ljava/lang/String;

.field public final message:Ljava/lang/String;

.field public final sendButtonTitle:Ljava/lang/String;

.field public final showAlwaysSendButton:Z

.field public final showCancelButton:Z

.field public final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->title:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->message:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->sendButtonTitle:Ljava/lang/String;

    .line 40
    iput-boolean p4, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->showCancelButton:Z

    .line 41
    iput-object p5, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->cancelButtonTitle:Ljava/lang/String;

    .line 42
    iput-boolean p6, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->showAlwaysSendButton:Z

    .line 43
    iput-object p7, p0, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->alwaysSendButtonTitle:Ljava/lang/String;

    return-void
.end method
