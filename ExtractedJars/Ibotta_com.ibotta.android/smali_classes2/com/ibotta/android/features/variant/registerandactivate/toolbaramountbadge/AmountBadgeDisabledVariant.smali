.class public Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeDisabledVariant;
.super Ljava/lang/Object;
.source "AmountBadgeDisabledVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .locals 3

    const-string v0, "AmountBadgeVariant is disabled"

    const/4 v1, 0x0

    .line 10
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method
