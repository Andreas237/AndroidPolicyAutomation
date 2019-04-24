.class public Lo/ezi$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezi$d$c;
    }
.end annotation


# instance fields
.field c:Lo/ezi$d$c;

.field e:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 334
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ezi$d;->e:Z

    .line 335
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezi$d;->c:Lo/ezi$d$c;

    return-void
.end method
