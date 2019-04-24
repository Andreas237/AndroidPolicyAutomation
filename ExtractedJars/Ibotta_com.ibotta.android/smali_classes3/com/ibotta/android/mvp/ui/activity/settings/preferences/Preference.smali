.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;
.super Ljava/lang/Object;
.source "Preference.java"


# instance fields
.field private checked:Z

.field private label:Ljava/lang/String;

.field private local:Z

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->local:Z

    return-void
.end method


# virtual methods
.method public getIsCheckedValue()Ljava/lang/String;
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->checked:Z

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->name:Ljava/lang/String;

    return-object v0
.end method

.method public isChecked()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->checked:Z

    return v0
.end method

.method public isLocal()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->local:Z

    return v0
.end method

.method public setChecked(Z)V
    .locals 0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->checked:Z

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->label:Ljava/lang/String;

    return-void
.end method

.method public setLocal(Z)V
    .locals 0

    .line 43
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->local:Z

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->name:Ljava/lang/String;

    return-void
.end method
