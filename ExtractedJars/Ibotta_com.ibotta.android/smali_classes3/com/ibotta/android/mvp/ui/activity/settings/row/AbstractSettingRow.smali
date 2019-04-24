.class public abstract Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;
.super Ljava/lang/Object;
.source "AbstractSettingRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRow;


# instance fields
.field private final settingRowType:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;->settingRowType:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;->settingRowType:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->ordinal()I

    move-result v0

    return v0
.end method
