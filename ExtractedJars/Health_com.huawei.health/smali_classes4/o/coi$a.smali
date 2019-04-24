.class Lo/coi$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/coi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final b:Lo/coi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Lo/coi;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/coi;-><init>(Lo/coi$4;)V

    sput-object v0, Lo/coi$a;->b:Lo/coi;

    .line 32
    return-void
.end method
