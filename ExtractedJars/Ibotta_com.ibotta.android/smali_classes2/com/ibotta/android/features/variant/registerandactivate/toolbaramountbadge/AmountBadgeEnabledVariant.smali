.class public Lcom/ibotta/android/features/variant/registerandactivate/toolbaramountbadge/AmountBadgeEnabledVariant;
.super Ljava/lang/Object;
.source "AmountBadgeEnabledVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
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
    .locals 2

    const-string v0, "AmountBadgeVariant is enabled"

    const/4 v1, 0x0

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method
