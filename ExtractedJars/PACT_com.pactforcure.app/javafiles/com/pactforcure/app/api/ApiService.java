// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.pactforcure.app.api.dto.ResetPasswordRequest;
import com.pactforcure.app.api.dto.SaveResponesRequestBody;
import java.util.Map;
import retrofit2.Call;

public interface ApiService
{

	public abstract Call leaveDna(String s);

	public abstract Call login(String s, String s1);

	public abstract Call registerDna(String s, Map map, okhttp3.MultipartBody.Part part);

	public abstract Call registerParticipant(Map map, okhttp3.MultipartBody.Part part);

	public abstract Call resetPassword(ResetPasswordRequest resetpasswordrequest);

	public abstract Call saveResponses(String s, SaveResponesRequestBody saveresponesrequestbody);

	public abstract Call updateProfile(String s, String s1, String s2, String s3, String s4, boolean flag, boolean flag1, 
			boolean flag2, int i);

	public abstract Call withdrawParticipant(String s);
}
