.class final Lo/fhv$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lo/fhv$9;->a:Landroid/content/Context;

    iput-object p2, p0, Lo/fhv$9;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 239
    iget-object v0, p0, Lo/fhv$9;->a:Landroid/content/Context;

    const-string v1, "2"

    iget-object v2, p0, Lo/fhv$9;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/fhv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    return-void
.end method
