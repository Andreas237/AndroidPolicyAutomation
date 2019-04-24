.class Lo/zx$5;
.super Ljava/util/HashSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/zx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashSet<Ljava/lang/String;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    .line 180
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 184
    const-string v0, "ser_country"

    invoke-virtual {p0, v0}, Lo/zx$5;->add(Ljava/lang/Object;)Z

    .line 185
    const-string v0, "reg_country"

    invoke-virtual {p0, v0}, Lo/zx$5;->add(Ljava/lang/Object;)Z

    .line 186
    const-string v0, "issue_country"

    invoke-virtual {p0, v0}, Lo/zx$5;->add(Ljava/lang/Object;)Z

    .line 1
    return-void
.end method
