.class Lo/cff$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field public d:F

.field public e:J


# direct methods
.method constructor <init>(JF)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-wide p1, p0, Lo/cff$b;->e:J

    .line 141
    iput p3, p0, Lo/cff$b;->d:F

    .line 142
    return-void
.end method
