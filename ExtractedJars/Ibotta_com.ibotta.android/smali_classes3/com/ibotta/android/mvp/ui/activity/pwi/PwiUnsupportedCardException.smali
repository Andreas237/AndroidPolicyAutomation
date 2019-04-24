.class public Lcom/ibotta/android/mvp/ui/activity/pwi/PwiUnsupportedCardException;
.super Ljava/lang/Exception;
.source "PwiUnsupportedCardException.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Unsupported card of type: %s, was tried."

    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method
