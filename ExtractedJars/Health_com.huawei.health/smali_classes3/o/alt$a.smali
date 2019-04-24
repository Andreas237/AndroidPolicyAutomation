.class Lo/alt$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Lo/ala;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1274
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1275
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt$a;->b:Lo/ala;

    .line 1276
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt$a;->a:Z

    return-void
.end method
