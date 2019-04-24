.class public Lo/dpv$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dpv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dpv$b$c;,
        Lo/dpv$b$d;
    }
.end annotation


# instance fields
.field b:I

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dpv$b$d;>;"
        }
    .end annotation
.end field

.field d:Z

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lo/dpv$b;->e:I

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lo/dpv$b;->b:I

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpv$b;->c:Ljava/util/List;

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dpv$b;->d:Z

    return-void
.end method
