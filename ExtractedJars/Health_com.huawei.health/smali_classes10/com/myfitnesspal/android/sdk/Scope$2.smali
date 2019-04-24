.class final enum Lcom/myfitnesspal/android/sdk/Scope$2;
.super Lcom/myfitnesspal/android/sdk/Scope;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/myfitnesspal/android/sdk/Scope;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/myfitnesspal/android/sdk/Scope;-><init>(Ljava/lang/String;ILcom/myfitnesspal/android/sdk/Scope$1;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 25
    const-string v0, "diary_readonly"

    return-object v0
.end method
