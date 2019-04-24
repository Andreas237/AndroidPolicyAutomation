.class Lo/cff$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public b:J

.field public d:I


# direct methods
.method constructor <init>(JI)V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-wide p1, p0, Lo/cff$a;->b:J

    .line 132
    iput p3, p0, Lo/cff$a;->d:I

    .line 133
    return-void
.end method
