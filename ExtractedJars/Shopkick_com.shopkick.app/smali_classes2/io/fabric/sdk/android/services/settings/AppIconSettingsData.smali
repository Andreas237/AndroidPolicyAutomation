.class Lio/fabric/sdk/android/services/settings/AppIconSettingsData;
.super Ljava/lang/Object;
.source "AppIconSettingsData.java"


# instance fields
.field public final hash:Ljava/lang/String;

.field public final height:I

.field public final width:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;->hash:Ljava/lang/String;

    .line 32
    iput p2, p0, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;->width:I

    .line 33
    iput p3, p0, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;->height:I

    return-void
.end method
