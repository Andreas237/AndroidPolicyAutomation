.class Lo/cqi$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final d:Lo/cqi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Lo/cqi;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqi;-><init>(Lo/cqi$2;)V

    sput-object v0, Lo/cqi$e;->d:Lo/cqi;

    .line 39
    return-void
.end method
