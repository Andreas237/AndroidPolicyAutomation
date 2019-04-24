.class public Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;
.super Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;
.source "SettingFooterRow.java"


# instance fields
.field private major:Ljava/lang/String;

.field private minor:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->FOOTER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;)V

    return-void
.end method


# virtual methods
.method public getMajor()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->major:Ljava/lang/String;

    return-object v0
.end method

.method public getMinor()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->minor:Ljava/lang/String;

    return-object v0
.end method

.method public setMajor(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->major:Ljava/lang/String;

    return-void
.end method

.method public setMinor(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingFooterRow;->minor:Ljava/lang/String;

    return-void
.end method
