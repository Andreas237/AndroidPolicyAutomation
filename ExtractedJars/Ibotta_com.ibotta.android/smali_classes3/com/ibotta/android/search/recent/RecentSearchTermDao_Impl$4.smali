.class Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$4;
.super Landroid/arch/persistence/room/SharedSQLiteStatement;
.source "RecentSearchTermDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;Landroid/arch/persistence/room/RoomDatabase;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl$4;->this$0:Lcom/ibotta/android/search/recent/RecentSearchTermDao_Impl;

    invoke-direct {p0, p2}, Landroid/arch/persistence/room/SharedSQLiteStatement;-><init>(Landroid/arch/persistence/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM search_terms WHERE category = ? AND search_term_key NOT IN(SELECT search_term_key FROM search_terms WHERE category = ? ORDER BY last_searched DESC LIMIT 100)"

    return-object v0
.end method
