package io.address.validation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

public class VerificationRequest {
	@SerializedName("requestId")
	private UUID requestId = null;
	@SerializedName("subscriptionId")
	private UUID subscriptionId = null;
	@SerializedName("serviceCode")
	private String serviceCode = null;
	@SerializedName("contractNumber")
	private String contractNumber = null;
	@SerializedName("acceptanceDate")
	private String acceptanceDate = null;
	@SerializedName("acceptance")
	private String acceptance = null;
	@SerializedName("holder")
	private Holder holder = null;
	@SerializedName("address")
	private Address address = null;

	public VerificationRequest requestId(UUID requestId) {
		this.requestId = requestId;
		return this;
	}

	@ApiModelProperty(example = "7c8a0230-36e0-43f4-9b7a-581dc55ea9c3", required = true, value = "")
	public UUID getRequestId() {
		return requestId;
	}

	public void setRequestId(UUID requestId) {
		this.requestId = requestId;
	}

	public VerificationRequest serviceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		return this;
	}

	public UUID getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(UUID subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(String acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public String getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(String acceptance) {
		this.acceptance = acceptance;
	}

	@ApiModelProperty(required = true, value = "")
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public VerificationRequest contractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public VerificationRequest holder(Holder holder) {
		this.holder = holder;
		return this;
	}

	@ApiModelProperty(value = "")
	public Holder getHolder() {
		return holder;
	}

	public void setHolder(Holder holder) {
		this.holder = holder;
	}

	public VerificationRequest address(Address address) {
		this.address = address;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VerificationRequest verificationRequest = (VerificationRequest) o;
		return Objects.equals(this.requestId, verificationRequest.requestId)
				&& Objects.equals(this.serviceCode, verificationRequest.serviceCode)
				&& Objects.equals(this.contractNumber, verificationRequest.contractNumber)
				&& Objects.equals(this.holder, verificationRequest.holder)
				&& Objects.equals(this.address, verificationRequest.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, serviceCode, contractNumber, holder, address);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VerificationRequest {\n");

		sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
		sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
		sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
		sb.append("    acceptanceDate: ").append(toIndentedString(acceptanceDate)).append("\n");
		sb.append("    acceptance: ").append(toIndentedString(acceptance)).append("\n");
		sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
