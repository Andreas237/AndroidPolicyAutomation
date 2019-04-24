.class public abstract Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;
.super Ljava/lang/Object;
.source "AbstractPreferencesRow.java"


# instance fields
.field private final rowType:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;->rowType:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;->rowType:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;->ordinal()I

    move-result v0

    return v0
.end method
