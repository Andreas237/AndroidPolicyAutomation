.class Lcom/shopkick/app/util/badge/SonyBadgeProvider$1;
.super Landroid/content/AsyncQueryHandler;
.source "SonyBadgeProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/util/badge/SonyBadgeProvider;->executeBadgeByContentProvider(Landroid/content/Context;Landroid/content/ComponentName;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/util/badge/SonyBadgeProvider;


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/badge/SonyBadgeProvider;Landroid/content/ContentResolver;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider$1;->this$0:Lcom/shopkick/app/util/badge/SonyBadgeProvider;

    invoke-direct {p0, p2}, Landroid/content/AsyncQueryHandler;-><init>(Landroid/content/ContentResolver;)V

    return-void
.end method
